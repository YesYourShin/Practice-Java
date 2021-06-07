import com.google.gson.Gson;

public class JSONReader {

	public static void main(String[] args) throws Exception {
		String site = "https://jsonplaceholder.typicode.com/posts";
//		URL url = new URL(site);
//		
//		URLConnection con = url.openConnection();
//		
//		InputStream stream = con.getInputStream();
//		
//		InputStreamReader reader = new InputStreamReader(stream, "UTF-8");
//		
//		BufferedReader bufReader = new BufferedReader(reader);
//		
//		String line = null;
//		while((line = bufReader.readLine()) != null) {
//			System.out.println(line);
//		}	
		
		Gson gson = new Gson();
		String json = "{'userId' : 1, 'id':1, 'title':'test', 'body':'test body'}";
		Post post = gson.fromJson(json, Post.class);
		/*
		 * Post post = new Post();
		 * post.setUserId(1);
		 * post.setId(1);
		 * psot.setTitle("title");
		 * post.setBody("test body");
		 * return post;
		 */

		System.out.println(post.getUserId());
		System.out.println(post.getId());
		System.out.println(post.getTitle());
		System.out.println(post.getBody());
		
		
	}
}
