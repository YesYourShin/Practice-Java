// Generic class
// Type parameter
public class GenericBox<T> {
	private T content;
//	private int dummy;
	
	public T getContent() {
		return content;
	}
	
	public void setContent(T content) {
		this.content = content;
	}
}
