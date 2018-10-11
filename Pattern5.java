import java.util.*;
class Pattern5{
	public static void main(String args[]){
		int n,i,j,p=65;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit: ");
		n=sc.nextInt();
		for(i=1;i<=n;i++){
			for(j=n-i;j>=1;j--){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
}