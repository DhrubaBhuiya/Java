package ExceptionHandling;
@SuppressWarnings("serial")
public class AgeNotWithinRangeException extends Exception{
	public AgeNotWithinRangeException(String s){
		super(s);
	}
}
