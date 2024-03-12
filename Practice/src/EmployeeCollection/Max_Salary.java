package EmployeeCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Max_Salary {
 
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
		
		
		//Using Max function
		Employee e1 = emplist.stream()
							.max(Comparator.comparingDouble(Employee::getSalalry))
							.get();
		System.out.println(e1);
		
		
		//using sorted method
		Employee e2 = emplist.stream()
							.sorted(Comparator.comparingDouble(Employee::getSalalry).reversed())
							.collect(Collectors.toList())
							.get(0);
				
		System.out.println(e2);
			
		
	}
}
