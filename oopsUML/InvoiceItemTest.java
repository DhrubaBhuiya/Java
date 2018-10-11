package oopsUML;
import java.util.*;
public class InvoiceItemTest {
	public static void main(String[] args) {
		int id;
		String desc;
		int qty;
		double unitPrice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID, desc, qty, unit price:");
		id=sc.nextInt();
		desc=sc.next();
		qty=sc.nextInt();
		unitPrice=sc.nextDouble();
		InvoiceItem i1=new InvoiceItem(id,desc,qty,unitPrice);
		System.out.println("ID: "+i1.getId());
		System.out.println("Desc: "+i1.getDesc());
		System.out.println("Qty: "+i1.getQty());
		System.out.println("Unit Price: "+i1.getUnitPrice());
		System.out.println("Total: "+i1.getTotal());
		System.out.println("Invoice Data: "+i1.toString());
		sc.close();
	}
}
