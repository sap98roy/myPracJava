package CollectionsCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Convert_Array_2_List {

	public static void main(String[] args) {
		
		int[] arr = new int[] {5,6,44,32,1};
		
		//Converting Array to List
		List<Integer> list =Arrays.stream(arr)
								  .boxed()
								  .collect(Collectors.toList()); 
		
		
		//Finding max from a list
		int r = Collections.max(list);
		
		
		System.out.println(r);
	}
}
