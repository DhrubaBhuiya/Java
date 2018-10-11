package ExceptionHandling;

public class TaxCalculator{
	public double calculateTax(String empName, boolean isIndian, double empSal) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException{
		
		if(!isIndian){
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		}
		else if(empName==""){
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		}
		else if(empSal<10000){
			throw new TaxNotEligibleException("The employee does not need to pay tax");
		}
		
		double tax=0.0;
		if(empSal>100000)tax=8*empSal/100;
		else if(empSal>50000)tax=6*empSal/100;
		else if(empSal>30000)tax=5*empSal/100;
		else if(empSal>10000)tax=4*empSal/100;
		return tax;
		
	}
}
