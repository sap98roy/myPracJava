package CollectionsCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Max_Min_Num {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,6,8,5,88,52,0,8);
		
		//max
		int max = list.stream()
		            .max(Comparator.comparing(e->e))
		            .get();
		
		System.out.println(max);
		
		
		//min
		int min = list.stream()
	            .min(Comparator.comparing(e->e))
	            .get();
	
		System.out.println(min);
		
		
	}
}
