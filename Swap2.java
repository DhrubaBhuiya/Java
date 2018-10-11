import java.util.*;
class Swap2{
	public static void main(String args[]){
		int a,b,c;
		System.out.println("Enter value for a and b");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Original value of a is "+a+" and b is "+b);	
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("New value of a is "+a+" and b is "+b);
	}
}