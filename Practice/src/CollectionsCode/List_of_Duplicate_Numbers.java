package CollectionsCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class List_of_Duplicate_Numbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,5,6,7,8,2,1,10,12,10,8,3,5,1,2,10);
		
		Set<Integer> dups = list.stream()
								.filter(e->Collections.frequency(list, e)>1)
								.collect(Collectors.toSet());
		
		System.out.println(dups);
	}
}

