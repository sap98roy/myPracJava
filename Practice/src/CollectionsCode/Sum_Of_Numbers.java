package CollectionsCode;

import java.util.Arrays;
import java.util.List;

public class Sum_Of_Numbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,3,5,6,7,8,2,1,10,12,10,8,3,5,1,2,10);
		
		int sum = list.stream().mapToInt(i -> i.intValue()).sum();
		
		System.out.println(sum);
		
		
		double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
		
		System.out.println(avg);
		
		
		//or
		int[] arrays = {2,5,7,9,4};
		int sumSim = Arrays.stream(arrays).sum();
		System.out.println(sumSim);
	}
}
