package ExceptionHandling;
import java.util.*;
public class FactorialTest {

	public static void main(String[] args) {
		Factorial f = new Factorial();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		try{
			System.out.println(f.getFactorial(n));
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
	}

}
