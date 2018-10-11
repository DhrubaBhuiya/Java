package CollectionsActivity;

public class CarParkingTest {

	public static void main(String[] args) {
			
			Parked_CarOwnerList l=new Parked_CarOwnerList();
			Parked_CarOwner_Details obj=new Parked_CarOwner_Details("Ramesh", "Indigo", "WB01F0644", "Kolkata","70766840");
			System.out.println(l.add_new_car(obj));
			Parked_CarOwner_Details obj1=new Parked_CarOwner_Details("Suresh", "Indica", "WB01F0645", "Kolkata","70766841");
			System.out.println(l.add_new_car(obj1));
			Parked_CarOwner_Details obj2=new Parked_CarOwner_Details("Yogesh", "IndicaXL", "WB01F0646", "Kolkata","70766842");
			System.out.println(l.add_new_car(obj2));
			
			l.showall();
			System.out.println("");
			l.removecar(2);
			l.showall();
			System.out.println("");
			System.out.println(l.get_parked_car_location(19));
			

		}

	}