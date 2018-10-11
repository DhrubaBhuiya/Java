package ExceptionHandling;

public class CalculatorSimulator {

	public static void main(String[] args) {
		TaxCalculator tc = new TaxCalculator();
		try{
			double tax=tc.calculateTax("Ron", false, 34000);
			System.out.println("Tax amount is "+tax);
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try{
			double tax=tc.calculateTax("Tim", true, 1000);
			System.out.println("Tax amount is "+tax);
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try{
			double tax=tc.calculateTax("Jack", true, 55000);
			System.out.println("Tax amount is "+tax);
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try{
			double tax=tc.calculateTax("", true, 30000);
			System.out.println("Tax amount is "+tax);
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
