package CollectionsActivity;

import java.util.Date;

public class Shop {
	public static void main(String ag[]) throws Exception
	{
		MyShopping ms=new MyShopping();
		Date dt=new Date();
		try
		{
			Order od=new Order("O12345", "Grocery", dt ); 
			Customer cl=new Customer(1, "Ramesh");
			ms.storeRecord(cl, od);
			ms.getRecord(cl);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}

