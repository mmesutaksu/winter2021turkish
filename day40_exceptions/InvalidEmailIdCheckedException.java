package day40_exceptions;

public class InvalidEmailIdCheckedException extends Exception {
	
	
	private static final long serialVersionUID = 1L;  
	// Java Exceptionlarin tekrarsiz olmasini saglamak icin
	// her Exception'a unique bir kod verir

	InvalidEmailIdCheckedException(String message) {
		super(message);
	}
	
}
