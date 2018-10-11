package ExceptionHandling;

public class Factorial {
	public int getFactorial(int num) throws InvalidInputException, FactorialException{
		double f=1;
		int fact,max;
		if(num<2)throw new InvalidInputException("Number should be greater than or equal to 2");
		for(int i=1;i<=num;i++)f=f*i;
		max=Integer.MAX_VALUE;
		if(f>max) throw new FactorialException("Factorial exceeding max int length");
		fact=(int) f;
		return fact;		
	}
}
