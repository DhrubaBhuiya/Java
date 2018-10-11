import java.util.*;
class SumOfDigits{
	public static void main(String args[]){
		int n,d,s=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		while(n>0){
			d=n%10;
			s+=d;
			n/=10;
		}
		System.out.println("Sum of digits: "+s);
	}
}