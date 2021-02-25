package LibraryApp;

public class IncorrectTitleException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncorrectTitleException(String errorMessage) {
        super(errorMessage);
    }
	
	public IncorrectTitleException(String errorMessage, Throwable err) {
        super(errorMessage);
    }
}
