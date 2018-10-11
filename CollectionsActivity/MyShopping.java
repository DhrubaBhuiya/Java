package CollectionsActivity;

import java.util.Hashtable;
public class MyShopping {
	private Hashtable <Customer, Order> ht=new Hashtable<>();
	public void storeRecord(Customer cl, Order od)
	{
		ht.put(cl, od);
	}
	public void getRecord(Customer cl)
	{
		System.out.print(cl.toString()+" ");
		System.out.println(ht.get(cl).toString());
	}
}
