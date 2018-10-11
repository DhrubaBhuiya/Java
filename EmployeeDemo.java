package EmployeePack;
import java.util.*;
public class EmployeeDemo {
	public static void main(String[]args){
		int n;
		System.out.println("Enter number of emloyees: ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		Employee emp[] = new Employee[n];
		for(int i=0;i<n;i++){
			emp[i]=new Employee();
		}
		System.out.println("Enter employee details\n");
		for(int i=0;i<n;i++){
			emp[i].lname=sc.next();
			emp[i].fname=sc.next();
			emp[i].midi=sc.next().charAt(0);
			emp[i].dept=sc.next();
			emp[i].spanish=sc.nextBoolean();
			emp[i].hdeg=sc.next();
			emp[i].year=sc.nextInt();			
		}
		Calendar today = Calendar.getInstance();
		int cyr = (int)today.get(Calendar.YEAR);
		System.out.println("South American trainer candidates\n");
		for(int i=0;i<n;i++){
			if(emp[i].spanish==true&&emp[i].hdeg.compareTo("BA")>=1&&(cyr-emp[i].year>=5)){
				System.out.println(emp[i].lname+" "+emp[i].fname+" "+emp[i].midi+" ,"+emp[i].dept);
			}
		}
	}
}
