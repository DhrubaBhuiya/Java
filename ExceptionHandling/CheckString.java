package ExceptionHandling;

public class CheckString {
	public boolean checkLength(String s)throws StringTooLongException{
		
		if(s.length()>20)
			throw new StringTooLongException("String exceeds 20 character limit");
		return true;
	}
}
