public class ExpTest {
	@SuppressWarnings("finally")
	public static int test(){
		try{
			int a = 10/0;
			return 1;
		}
		catch(Exception e){
			return 2;
		}
		finally{
			System.out.println("Yo");
		}
	}
	public static void main(String[]arg){
		System.out.println(ExpTest.test());
	}
}
