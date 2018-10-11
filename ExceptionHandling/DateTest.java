package ExceptionHandling;

public class DateTest {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		MyDate m;
		for(String s:args){
			try {
				m=new MyDate(s);
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	}

}
