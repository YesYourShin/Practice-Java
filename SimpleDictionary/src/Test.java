import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		Properties props = new Properties();
		File file = new File("dict.props");
		try (FileReader reader = new FileReader("dict.props")) {
			props.load(reader);
		} catch (Exception err) {
			System.out.println(err.getMessage());
		}
		System.out.println(props.get("���"));
		props.put("���", "rose");
		try {
			out = new FileOutputStream("dict.props");
			props.store(out, "���� �ѿ�����");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				out.close();
			} catch(Exception ignore) {}
		}
		
	}

}
