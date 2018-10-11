import java.util.*;
public class ContainsDuplicate {
	public static void main(String[]args){
		int n,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter numbers:\n");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter value of k: ");
		k=sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(arr[i]==arr[j]&&Math.abs(i-j)<=k&&i!=j){
					System.out.println("True");
					return;
				}
			}
		}
		System.out.println("False");
	}
}
