import java.util.*;
public class StringReverse {

	public static void main(String[] args) {
		String str;
		String str1="",str2="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		str=sc.nextLine();
		str+=" ";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				for(int j=str1.length()-1;j>=0;j--){
					str2=str2+str1.charAt(j);
				}
				str2+=" ";
				str1="";
			}
			else{
				str1+=str.charAt(i);
			}
		}
		System.out.println(str2);
	}

}
