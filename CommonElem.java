import java.util.*;
class CommonElem{
	public static void main(String args[]){
		int n1,n2,n3,i,j,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit for array 1: ");
		n1=sc.nextInt();
		int arr1[]=new int[n1];
		System.out.println("Enter numbers: \n");
		for(i=0;i<n1;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter limit for array 2: ");
		n2=sc.nextInt();
		int arr2[]=new int[n2];
		System.out.println("Enter numbers: \n");
		for(i=0;i<n2;i++){
			arr2[i]=sc.nextInt();
		}
		System.out.println("Enter limit for array 3: ");
		n3=sc.nextInt();
		int arr3[]=new int[n3];
		System.out.println("Enter numbers: \n");
		for(i=0;i<n3;i++){
			arr3[i]=sc.nextInt();
		}
		i=0;j=0;k=0;
		while(i<n1&&j<n2&&k<n3){
			if(arr1[i]==arr2[j]&&arr2[j]==arr3[k]){
				System.out.println(arr1[i]);
				i++;
				j++;
				k++;
			}
			else if(arr1[i]<arr2[j])i++;
			else if(arr2[j]<arr3[k])j++;
			else k++;
		}
	}
}