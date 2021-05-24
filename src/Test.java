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
		System.out.println(props.get("사과"));
		props.put("장미", "rose");
		try {
			out = new FileOutputStream("dict.props");
			props.store(out, "나의 한영사전");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				out.close();
			} catch(Exception ignore) {}
		}
		
	}

}
