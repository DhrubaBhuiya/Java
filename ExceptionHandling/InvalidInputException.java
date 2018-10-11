package ExceptionHandling;

@SuppressWarnings("serial")
public class InvalidInputException extends Exception{
	public InvalidInputException(String s){
		super(s);
	}
}
