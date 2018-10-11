package ExceptionHandling;

@SuppressWarnings("serial")
public class InvalidDayException extends Exception{
	public InvalidDayException(String s){
		super(s);
	}
}
