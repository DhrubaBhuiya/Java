package oopsUML;
import java.util.*;
public class GradesAverage {
	public static void main(String[]args){
		int n;
		float sum=0,avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		n=sc.nextInt();
		int arr[]=new int[n];
		int i=0;
		while(i<n){
			System.out.println("Enter the grade for student "+(i+1));
			arr[i]=sc.nextInt();
			if(arr[i]>=0&&arr[i]<=100) i++;
			else System.out.println("Invalid grade, try again...");
		}
		for(i=0;i<n;i++) sum+=arr[i];
		avg=sum/n;
		System.out.println("The average is: "+avg);
		sc.close();
	}
}
