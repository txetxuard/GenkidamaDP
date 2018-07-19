package interfaces;

import java.io.Serializable;

public abstract class Container<T>implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4853898367025007967L;
	private T content;
	
	public Container(T content) {
		this.content = content;
	}
	
	public T getContent() {
		return content;
	}
}
