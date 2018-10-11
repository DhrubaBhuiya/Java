package CollectionsActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class Parked_CarOwnerList {
	int token=1;
	List<Parked_CarOwner_Details> l1=new ArrayList<>();
	public int add_new_car(Parked_CarOwner_Details obj)
	{
		l1.add(obj);
		return token++;
	}
	public void removecar(int tok)
	{
		tok--;
		l1.remove(tok);
	}
	
	public void showall()
	{
		Iterator<Parked_CarOwner_Details> itr=l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().toString());
		}
	}
	
	public String get_parked_car_location(int token)
	{
		token--;
		if(token>0&&token<=19)
		return "Ground Floor Section 1";
		if(token>=20&&token<=39)
		return "Ground Floor Section 2";
		if(token>=40&&token<=59)
		return "Ground Floor Section 3";
		if(token>=60&&token<=79)
		return "Ground Floor Section 4";
		if(token>=80&&token<=99)
		return "First Floor Section 1";
		if(token>=100&&token<=119)
		return "First Floor Section 2";
		if(token>=120&&token<=139)
		return "First Floor Section 3";
		if(token>=140&&token<=159)
		return "First Floor Section 4";
		if(token>=160&&token<=179)
		return "First Floor Section 1";
		if(token>=180&&token<=199)
		return "First Floor Section 2";
		if(token>=200&&token<=219)
		return "First Floor Section 3";
		if(token>=220&&token<=239)
		return "First Floor Section 4";
		else
			return "Car not found";		
	}
	


}
