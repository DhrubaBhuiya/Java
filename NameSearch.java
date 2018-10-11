import java.util.*;
public class NameSearch {
	public static void main(String[]args){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of names: ");
		n=sc.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.next();
		}
		System.out.println("Enter the string to be searched: ");
		String str=sc.next();
		int c=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i].equalsIgnoreCase(str)){
				c++;
			}
		}
		if(c>0){
			System.out.println("Found. Count: "+c);
		}
		else{
			System.out.println(str+" not found");
		}
	}
}
