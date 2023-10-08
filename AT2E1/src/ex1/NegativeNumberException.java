package ex1;

public class NegativeNumberException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public NegativeNumberException() {
		super("Número negativo, tente novamente!");
	}
}
