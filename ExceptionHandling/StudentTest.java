package ExceptionHandling;
import java.util.*;
public class StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int roll = 0;
		String name = null;
		int age = 0;
		String course = null;
		roll=sc.nextInt();
		name=sc.next();
		age=sc.nextInt();
		course=sc.next();
		sc.close();
		try{
			@SuppressWarnings("unused")
			Student s = new Student(roll,name,age,course);
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
	}

}
