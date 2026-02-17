package exception;


class TypeTwoException extends RuntimeException {
	public TypeTwoException(String message) {
		super(message);
	}
	
}


public class RunTimeException {

	public static void main(String[] args) {
		throw new TypeTwoException("You are not allowed");

	}

}
