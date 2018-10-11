package oopsUML;
import java.util.*;
public class AccountTest {
	public static void main(String[]args){
		String id;
		String name;
		int balance=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID, name, balance");
		id=sc.next();
		name=sc.next();
		balance=sc.nextInt();
		Account a1=new Account(id,name,balance);
		System.out.println("ID: "+a1.getId()+" Name: "+a1.getName()+" Balance: "+a1.getBalance());
		a1.credit(500);
		System.out.println("New Balance: "+a1.getBalance());
		Account a2=new Account("a101","Sam");
		System.out.println("Second acount: "+a2.toString());
		a1.transferTo(a2, 500);
		System.out.println("Second acount after transfer: "+a2.toString());
		System.out.println("First acount after transfer: "+a1.toString());
		sc.close();
	}
}
