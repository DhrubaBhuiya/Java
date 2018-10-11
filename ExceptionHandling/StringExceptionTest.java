package ExceptionHandling;
import java.util.*;
public class StringExceptionTest {

	public static void main(String[] args) {
		String str="";
		CheckString cs = new CheckString();
		Scanner sc = new Scanner(System.in);
		try{
			while(!str.equals("DONE")){
				str=sc.next();
				cs.checkLength(str);
			}
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
		finally{
			sc.close();
		}
	}

}
