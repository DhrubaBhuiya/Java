package CollectionsActivity;

public class Employee_information {
	private String empID;
	private String Employee_name;
	private String employee_designation;
	private double Employee_salary;
	private String employee_comm;
	
		
	
	public Employee_information(String empID, String employee_name,
			String employee_designation, double employee_salary,
			String employee_comm) {
		this.empID = empID;
		Employee_name = employee_name;
		this.employee_designation = employee_designation;
		setEmployee_salary(employee_salary);
		this.employee_comm = employee_comm;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getEmployee_name() {
		return Employee_name;
	}
	public void setEmployee_name(String employee_name) {
		Employee_name = employee_name;
	}
	public String getEmployee_designation() {
		return employee_designation;
	}
	public void setEmployee_designation(String employee_designation) {
		this.employee_designation = employee_designation;
	}
	public String getEmployee_comm() {
		return employee_comm;
	}
	public void setEmployee_comm(String employee_comm) {
		this.employee_comm = employee_comm;
	}
	public double getEmployee_salary() {
		return Employee_salary;
	}
	public void setEmployee_salary(double employee_salary) {
		Employee_salary = employee_salary;
	}
	public String toString(){
		return empID+" "+Employee_name+" "+employee_designation+" "+Employee_salary+" "+employee_comm;
	}
	
}
