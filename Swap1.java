import java.util.*;
class Swap1{
	public static void main(String args[]){
		int a,b,c;
		System.out.println("Enter value for a and b");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Original value of a is "+a+" and b is "+b);	
		c=a;
		a=b;
		b=c;
		System.out.println("New value of a is "+a+" and b is "+b);
	}
}