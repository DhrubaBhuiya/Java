import java.util.*;
public class MultiArr {
	public static void main(String[]args){
		int r,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows and cols: \n");
		r=sc.nextInt();
		c=sc.nextInt();
		int arr[][]=new int[r][c];
		System.out.println("Enter numbers: \n");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter value: \n");
		int val=sc.nextInt();
		for(int i=0;i<r;i++){
			for(int j=0;i<c;i++){
				if(arr[i][j]==val){
					System.out.println("Found");
					return;
				}
			}
		}
		System.out.println("Not Found");
	}
}
