import java.util.*;
class LargestElem{
	public static void main(String args[]){
		int n,i,j,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit: ");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter numbers: \n");
		for(i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n-1;i++){
			for(j=0;j<n-i-1;j++){
				if(arr[j]<arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("The largest 3 numbers are: "+arr[0]+","+arr[1]+","+arr[2]);
	}
}