import java.io.File;
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
		System.out.println(props.get("»ç°ú"));
		
		
		
	}

}
