package EmployeeCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Group_By_EmpSex {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(34,"Ram", 18000.00, 'm');
		Employee emp2 = new Employee(22,"Shyam", 22000.00, 'm');
		Employee emp3 = new Employee(54,"Jade", 44000.00, 'f');
		Employee emp4 = new Employee(11,"Modhu", 23000.00, 'm');
		Employee emp5= new Employee(9,"Kalo", 15000.00, 'f');
		
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		emplist.add(emp5);
		
		
		
		Map<Character, Long> list = emplist
								.stream()
								.collect(Collectors.groupingBy(Employee::getSex,Collectors.counting()));
		
		System.out.println(list);
	}
}
