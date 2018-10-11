package Stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
public class EmployeeService {
	
	public double getSumOfSalary(List<Employee> l){
		double sum=0;
		Stream<Employee> stream = l.stream();
		sum=stream.mapToDouble(obj->obj.getSalary()).sum();
		return sum;	
	}
	public void countDeptEmployees(List<Employee> emp){	
		Stream<Employee> stream = emp.stream();
		Object[] s = stream.filter(obj->obj.getDepartment()!=null).toArray();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (Object temp : s) {
			Employee e = (Employee)temp;
			String str = e.getDepartment().getDepartmentName();
			Integer count = map.get(str);
			map.put(str, (count == null) ? 1 : count + 1);
		}
		System.out.println(map);
	}
	public void employeeWODept(List<Employee> emp){
		Stream<Employee> stream = emp.stream();
		stream.filter(obj->obj.getDepartment()==null).forEach(obj->System.out.println(obj.getFirstName()+" "+obj.getLastName()));
	}
	public void employeeSalaryHike(List<Employee> emp){
		Stream<Employee> stream = emp.stream();
		stream.forEach(obj->System.out.println(obj.getFirstName()+" "+obj.getLastName()+" "+obj.getSalary()+" "+obj.getSalary()*115/100));
	}
	public void employeeWOManager(List<Employee> emp){
		Stream<Employee> stream = emp.stream();
		stream.filter(obj->obj.getManagerId()==null).forEach(obj->System.out.println(obj.getFirstName()+" "+obj.getLastName()));
	}
	
	public static void main(String[]args){
		List<Employee> employees = EmployeeRepository.getEmployees();
		//List<Department> departments = EmployeeRepository.getDepartments();
		EmployeeService es =  new EmployeeService();
		System.out.println("Sum of Salaries: "+es.getSumOfSalary(employees));	
		es.countDeptEmployees(employees);
		System.out.println("Employees without dept:");	
		es.employeeWODept(employees);
		System.out.println("Employees with current salary and hiked salary:");
		es.employeeSalaryHike(employees);
		System.out.println("Employees without manager:");	
		es.employeeWOManager(employees);
		
		
	}
}
