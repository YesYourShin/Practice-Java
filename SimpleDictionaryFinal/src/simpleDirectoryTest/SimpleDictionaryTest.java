package simpleDirectoryTest;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleDictionaryTest extends JPanel implements ActionListener {
	private JTextField inputField = new JTextField(30);
	private JButton searchBtn = new JButton("검색");
	private JButton addBtn = new JButton("추가");
	private JPanel searchAddPanel = new JPanel();
	private Map<String, String> dict = new HashMap<>();
	
	private String driverClassName ;
	private String dbUrl ;
	private String userName, userPassword;
	
	public SimpleDictionaryTest() {
		searchAddPanel.add(inputField);
		searchAddPanel.add(searchBtn);
		searchBtn.addActionListener(this);
		searchAddPanel.add(addBtn);
		addBtn.addActionListener(this);
		searchAddPanel.setPreferredSize(new Dimension(600, 50));
	
		this.setLayout(new BorderLayout());
		this.add(searchAddPanel, BorderLayout.CENTER);

		initialize();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == searchBtn) {
			String key = inputField.getText();
			String value = dict.get(key);
			if (key.trim().length() == 0 || value == null) {
				JOptionPane.showMessageDialog(this, "단어를 찾을 수 없습니다.", "단어찾기 실패", JOptionPane.ERROR_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(this, value, key, JOptionPane.INFORMATION_MESSAGE);	
			}
			inputField.requestFocus();
		} else if (e.getSource() == addBtn) {
			String key = inputField.getText();
			String value = JOptionPane.showInputDialog(this, key + "에 대응되는 영어 단어를 입력하세요.");
			
			if (key.trim().length() > 0 && value.trim().length() > 0) {
				dict.put(key,  value);
				addToDB(key, value);
				JOptionPane.showMessageDialog(this, "영어단어가 추가되었습니다.", "추가성공", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		repaint();
	}
	
	private void initialize() {
		Connection con = null;
		try {
			Properties dbconfig = new Properties();
			File file = new File("dbconfig.props");
			System.out.println(file.getAbsolutePath());
			FileReader reader = new FileReader(file);
			dbconfig.load(reader);
			
			driverClassName = dbconfig.getProperty("driverClassName");
			dbUrl = dbconfig.getProperty("Url");
			userName = dbconfig.getProperty("userPassword");
			userPassword = dbconfig.getProperty("userPassword");
			System.out.printf("%s\n%s\n%s\n%s\n", driverClassName, dbUrl, userName, userPassword);
			
			dbconfig.load(reader);
			Class.forName(driverClassName);
			con = DriverManager.getConnection(dbUrl, userName, userPassword);
			
			PreparedStatement pstmt = con.prepareStatement("select * from simple_dict");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				String key = rs.getString("hword");
				String value = rs.getString("eword");
				dict.put(key, value);
			}
		} catch(ClassNotFoundException e) {
			System.out.println(driverClassName + "를 찾을 수 없습니다.");
		} catch(SQLException e) {
			System.out.println("데이터베이스 서버에 연결할 수 없습니다...:" + e.getMessage());
		} catch(IOException e) {
			System.out.println("dbconfig.props 파일을 읽을 수 없습니다...:" + e.getMessage());
		} finally {
			try {
				con.close();
			} catch(Exception e) {}
		}
	}

	private void addToDB(String key, String value) {
		try (Connection con = DriverManager.getConnection(dbUrl, userName, userPassword)) {
			String sql = "insert into simple_dict(hword, eword) values(?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, key);
			pstmt.setString(2, value);
			pstmt.executeUpdate();
			
		} catch(SQLException e) {
			System.out.println("DB에 데이터를 삽입할 수 없습니다. : " + e.getMessage());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}