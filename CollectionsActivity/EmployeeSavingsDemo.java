package CollectionsActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class EmployeeSavingsDemo {

	public static void main(String[] args) {
		List<Employee_information> empList = new ArrayList<Employee_information>();
		List<MMASaving_Account> accList = new ArrayList<MMASaving_Account>();
		Map<Employee_information, MMASaving_Account> map = new HashMap<Employee_information, MMASaving_Account>();
		
		Employee_information e = new Employee_information("e101", "Ram", "Analyst", 25000, "abc");
		empList.add(e);
		MMASaving_Account m = new MMASaving_Account("a101", "Ram", 50000, true);
		accList.add(m);
		map.put(e, m);
		
		e = new Employee_information("e105", "Rajesh", "Analyst", 20000, "abc");
		empList.add(e);
		m = new MMASaving_Account("a454", "Rajesh", 30000, false);
		accList.add(m);
		map.put(e, m);
		
		e = new Employee_information("e202", "Tarun", "Senior Analyst", 35000, "abc");
		empList.add(e);
		m = new MMASaving_Account("a891", "Tarun", 50000, true);
		accList.add(m);
		map.put(e, m);
		
		e = new Employee_information("e968", "Sam", "Associate", 15000, "abc");
		empList.add(e);
		m = new MMASaving_Account("a955", "Sam", 20000, true);
		accList.add(m);
		map.put(e, m);
		
		System.out.println("Searching Information for Ram:");
		Iterator<Employee_information> itr = empList.iterator();
		
		while(itr.hasNext()){
			Employee_information emp = itr.next();
			if(emp.getEmployee_name().equals("Ram")){
				System.out.println(emp);
				System.out.println(map.get(emp));
			}
		}

	}

}
