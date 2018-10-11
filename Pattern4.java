import java.util.*;
class Pattern4{
	public static void main(String args[]){
		int n,i,j,p=65;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit: ");
		n=sc.nextInt();
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.print((char)p);
			}
			p++;
			System.out.println("\n");
		}
	}
}