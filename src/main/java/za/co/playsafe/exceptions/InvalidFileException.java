package za.co.playsafe.exceptions;

public class InvalidFileException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static String MESSAGE = "INVALID FILE!";
	
	public InvalidFileException() {
		super(MESSAGE);
	
	}

	public InvalidFileException(String file) {
		super(MESSAGE +" "+ file);
		
	}

}
