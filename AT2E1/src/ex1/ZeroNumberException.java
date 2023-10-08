package ex1;

public class ZeroNumberException extends RuntimeException {

	private static final long serialVersionUID = 10L;
	
	public ZeroNumberException() {
		super("Número igual a 0");
	}

}
