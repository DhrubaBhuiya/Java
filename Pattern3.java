import java.util.*;
class Pattern3{
	public static void main(String args[]){
		int n,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit: ");
		n=sc.nextInt();
		for(i=n;i>=1;i--){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
}