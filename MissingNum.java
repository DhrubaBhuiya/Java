import java.util.*;
class MissingNum{
	public static void main(String args[]){
		int n,i,j,f=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit: ");
		n=sc.nextInt();
		int arr[]=new int[n-1];
		System.out.println("Enter the numbers:\n");
		for(i=0;i<n-1;i++){
			arr[i]=sc.nextInt();
		}
		for(i=1;i<=n;i++){
			f=0;
			for(j=0;j<n-1;j++){
				if(arr[j]==i){
					f=1;
					break;
				}
			}
			if(f==0){
				System.out.println("The missing number is: "+i);
				break;
			}
		}
	}
}