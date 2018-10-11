package ExceptionHandling;
import java.util.*;
import java.util.regex.Pattern;
public class NumberTest {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int l,c=0;
		String str;
		float s=0,n;
		System.out.println("Enter limit: ");
		l=sc.nextInt();
		System.out.println("Enter Numbers: ");
		try{
			while(l>0){
				str=sc.next();
				if(!Pattern.matches("[0-9]*[.]{0,1}[0-9]*", str)){
					c++;
					if(c==2) throw new NumberException("Not a Number");				
				}
				else{
					n=Float.parseFloat(str);
					s=s+n;
					l--;
				}
			}
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
		finally{
			System.out.println(s);
			sc.close();
		}
	}

}
