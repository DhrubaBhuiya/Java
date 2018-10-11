import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		int n,d,m,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		m=n;
		while(n>0){
			d=n%10;
			s=s*10+d;
			n=n/10;
		}
		if(m==s)
			System.out.println("True");
		else 
			System.out.println("False");

	}

}
