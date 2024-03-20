package EmployeeCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfSalary {

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
		
		
		double total = emplist.stream()
				   .collect(Collectors.summingDouble(Employee::getSalalry));

		double totalSalByDept = emplist.stream().
				  filter(name -> 1000 == name.getId())
				   .collect(Collectors.summingDouble(Employee::getSalalry));

		System.out.println("Total Employees Salary : " + total);
	    System.out.println("Total Employees Salary of 1000 Dept : " + totalSalByDept);
	}
}
