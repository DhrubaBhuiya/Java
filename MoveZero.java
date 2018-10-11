import java.util.*;
class MoveZero{
	public static void main(String args[]){
		int n,i,k=0,c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit: ");
		n=sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[n];
		System.out.println("Enter numbers: \n");
		for(i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++){
			if(arr[i]==0)c++;
			else{
				arr1[k]=arr[i];
				k++;
			}
		}
		for(i=1;i<=c;i++)arr1[k++]=0;
		for(i=0;i<k;i++)System.out.print(arr1[i]+" ");
	}
}