import java.util.*;
public class PalindromeSort {
	public static void main(String[]args){
		String arr[]=new String[10];
		String arr1[]=new String[10];
		String temp="";
		int j=0,k=0,t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Strings:");
		for(int i=0;i<10;i++){
			arr[i]=sc.next();
			temp="";
			for(j=arr[i].length()-1;j>=0;j--){
				temp+=arr[i].charAt(j);
			}
			if(temp.equals(arr[i])){
				arr1[k++]=arr[i];
			}
		}
		int lenarr[]=new int[k];
		for(int i=0;i<k;i++){
			lenarr[i]=arr1[i].length();
		}
		for(int i=0;i<k-1;i++){
			for(j=0;j<k-i-1;j++){
				if(lenarr[j]<lenarr[j+1]){
					t=lenarr[j];
					lenarr[j]=lenarr[j+1];
					lenarr[j+1]=t;
					temp=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
				}
			}
		}
		for(int i=0;i<k;i++){
			System.out.println(arr1[i]);
		}
	}
}
