package oopsUML;
import java.util.*;
public class EmployeeTest {
	public static void main(String[] args) {
		int id;
		String firstName;
		String lastName;
		int salary;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID, first name, last name, salary:");
		id=sc.nextInt();
		firstName=sc.next();
		lastName=sc.next();
		salary=sc.nextInt();
		Employee e1=new Employee(id,firstName,lastName,salary);
		System.out.println("First Name: "+e1.getFirstName());
		System.out.println("Last Name: "+e1.getLastName());
		System.out.println("ID: "+e1.getId());
		System.out.println("Name: "+e1.getName());
		System.out.println("Salary: "+e1.getSalary());
		System.out.println("Annual Salary: "+e1.getAnnualSalary());
		e1.raiseSalary(10);
		System.out.println("Employee Data: "+e1.toString());
		sc.close();
	}

}
