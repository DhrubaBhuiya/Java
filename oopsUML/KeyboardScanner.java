package oopsUML;
import java.util.*;
public class KeyboardScanner {
	public static void main(String[]args){
		int a;
		float b;
		String nm;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		a=sc.nextInt();
		System.out.println("Enter an floating point number: ");
		b=sc.nextFloat();
		System.out.println("Enter you name: ");
		nm=sc.next();
		System.out.println("Hi! "+nm+", the sum of "+a+" and "+b+" is "+(a+b));
		sc.close();
	}
}
