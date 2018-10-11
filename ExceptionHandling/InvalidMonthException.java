package ExceptionHandling;

@SuppressWarnings("serial")
public class InvalidMonthException extends Exception {
	public InvalidMonthException(String s){
		super(s);
	}
}
