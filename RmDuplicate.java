import java.util.*;
public class RmDuplicate {

	public static void main(String[] args) {
		String str,str1="";
		int i,f;
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		str=sc.next();
		for(i=0;i<str.length();i++){
			f=0;
			for(int j=0;j<str1.length();j++){
				if(str.charAt(i)==str1.charAt(j)){
					f=1;
					break;
				}
			}
			if(f==0)str1+=str.charAt(i);
		}
		System.out.println(str1);
		sc.close();
	}

}
