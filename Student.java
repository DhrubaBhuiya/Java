import java.util.*;
class Student{
	public static void main(String args[]){
		int arr[]=new int[20];
		int i,c=0;
		Scanner sc = new Scanner(System.in);
		for(i=0;i<20;i++){
			System.out.println("Enter mark: ");
			arr[i]=sc.nextInt();
		}
		for(i=0;i<20;i++){
			if(arr[i]>=86)c++;
		}
		System.out.println("Number of students that got more than 86: "+c);
	}
}