package ExceptionHandling;

@SuppressWarnings("serial")
public class CountryNotValidException extends Exception{
	public CountryNotValidException(String s) {
		super(s);
	}
}
