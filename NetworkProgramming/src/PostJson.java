import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import com.google.gson.Gson;

public class PostJson {

	public static void main(String[] args) throws Exception {
		String site = "https://jsonplaceholder.typicode.com/posts";
		URL url = new URL(site);
		
		URLConnection con = url.openConnection();
		
		InputStream stream = con.getInputStream();
		
		InputStreamReader reader = new InputStreamReader(stream, "UTF-8");
		
		BufferedReader bufReader = new BufferedReader(reader);
		
		String line = null;
		String jsonString = "";
		while((line = bufReader.readLine()) != null) {
//			System.out.println(line);
			jsonString += line;
		}	
		System.out.println(jsonString);
		Gson gson = new Gson();
//		String json = "[{'userId' : 1, 'id':1, 'title':'test', 'body':'test body'}, {'userId' : 2, 'id':2, 'title':'test2', 'body':'test2 body'}]";
		Post[] posts = gson.fromJson(jsonString, Post[].class);
		/*
		 * Post post = new Post();
		 * post.setUserId(1);
		 * post.setId(1);
		 * psot.setTitle("title");
		 * post.setBody("test body");
		 * return post;
		 */

		
		for (Post post : posts) {
			System.out.println("UserId : " + post.getUserId());
			System.out.println("Id : " + post.getId());
			System.out.println("Title : " + post.getTitle());
			System.out.println("Body : +" + post.getBody());
			System.out.println("####################");
				
		}
		
		insertIntoDB(posts);
	}
	
	private static void insertIntoDB(Post[] posts) throws Exception{
		/*
		 * 1. lass.forName(...); // JDBC 드라이버 메모리에 적재
		 * 2. Connection con = DriverManager.getConnection(...); DB 서버에 연결
		 * 3. String sql = "insert into posts(userId, id, title, body)
		 * 						values(?, ?, ?, ?);
		 * 	PrepareStatement pstmt = con.prepareStatement(sql);
		 * 
		 * 4. ? 자리에 들어갈 값을 설정한다.
		 * 	pstmt.setInt(1, post.getUserId());
		 * 	pstmt.setInt(2, post.getUserId());
		 * 	pstmt.setString(3, post.getTitle());
		 * 	pstmt.setString(4, post.getBody());
		 * 
		 * 5. 서버에 실행요청
		 * 	pstmt.executeUpdate();
		 * 6. con.close();
		 * 
		 */
		
		Class.forName("org.mariadb.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/oop";
		String id = "root";
		String pw = "1234";
		Connection con = DriverManager.getConnection(url, id, pw);
		String sql = "insert into posts(userId, id, title, body) values(?,?,?,?);";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		for (Post post : posts) {
			pstmt.setInt(1, post.getUserId());
			pstmt.setInt(2, post.getId());
			pstmt.setString(3, post.getTitle());
			pstmt.setString(4, post.getBody());
			pstmt.executeUpdate();
		}
		con.close();
	}
}
