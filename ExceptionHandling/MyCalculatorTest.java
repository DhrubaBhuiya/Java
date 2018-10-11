package ExceptionHandling;
import java.util.*;
public class MyCalculatorTest {
	public static void main(String[]args){
		int n,p;
		Scanner sc = new Scanner(System.in);
		do{
		n = sc.nextInt();
		p = sc.nextInt();
		}while(n<-10||n>10||p<-10||p>10);
		sc.close();
		MyCalculator mc = new MyCalculator();
		try{
			System.out.println(mc.power(n, p));
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
	}
}
