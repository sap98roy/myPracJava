package CollectionsCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class List_of_Non_Duplicate_Numbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,3,5,6,7,8,2,1,10,12,10,8,3,5,1,2,10);
		
		List<Integer> unq = list.stream()
		         .distinct()
		         .collect(Collectors.toList());
		
		System.out.println(unq);
	}
}
