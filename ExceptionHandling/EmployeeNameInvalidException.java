package ExceptionHandling;

@SuppressWarnings("serial")
public class EmployeeNameInvalidException extends Exception{
	public EmployeeNameInvalidException(String s){
		super(s);
	}
}
