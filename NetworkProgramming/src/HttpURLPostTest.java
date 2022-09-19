
import java.io.*;
import java.net.*;


public class HttpURLPostTest {

	public static void main(String[] args) {
		String site = "http://localhost:9090/todos";
		
		try {
			URL url = new URL(site);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			con.setDefaultUseCaches(false);
			con.setDoInput(true); // �б� ��� ����
			con.setDoOutput(true); // ���� ��� ����
			con.setRequestMethod("POST");
			
			con.setRequestProperty("content-type",  "application/x-www-fora-urlencoded");
			
//			String data = "id=scpark&pw=1111";
//			OutputStream ostream = con.getOutputStream();
//			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
			
			// ������ �� ����
			StringBuffer buffer = new StringBuffer();
			
			buffer.append("id=scpark").append("&pw=1111");
			
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(con.getOutputStream(), "UTF-8"));
			writer.println(buffer.toString());
			writer.flush();
			
			
			// �������� �� �ޱ�
			BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			String line = "";
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
