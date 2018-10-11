package ExceptionHandling;
@SuppressWarnings("serial")
public class NameNotValidException extends Exception{
	public NameNotValidException(String s){
		super(s);
	}
}
