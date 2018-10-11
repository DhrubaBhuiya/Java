import java.util.*;
public class StringProgram {
	public static void main(String[] args) {
		String str,str1;
		int p,k=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		str=sc.nextLine();
		System.out.println("Word to be deleted: ");
		str1=sc.next();
		System.out.println("Position: ");
		p=sc.nextInt();
		String starr[] = str.split(" ");
		for(int i=0;i<starr.length;i++){
			if(!starr[i].equals("")){
				if(!starr[i].equals(str1)||k!=p){
					System.out.print(starr[i]+" ");
				}
				k++;
			}			
		}
		sc.close();
	}

}
