package EmployeeCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Nth_Highest_Salary {

	public static void main(String[] args) {
		
		int[] arr = new int[] {5,6,44,32,1};
		
		//Converting Array to List
		List<Integer> list =Arrays.stream(arr)
				.boxed().collect(Collectors.toList());
		
		
		//Find Second Highest Element
		int r = list.stream()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println(r);
		
		
		
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
		
		
		
		//Find N-th highest salary
		Employee rEmp = emplist.stream()
								.sorted(Comparator.comparing(Employee::getSalalry).reversed())
								.skip(1)
								.findFirst()
								.get();
		
		
		System.out.println(rEmp);
		
	}
}
