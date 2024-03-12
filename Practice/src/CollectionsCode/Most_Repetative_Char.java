package CollectionsCode;

import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Most_Repetative_Char {

	public static void main(String[] args) {
		
		//List<Character> input  = Arrays.asList('a','c','b','a','l','k','a','a','l');
		
		String input = "My#name#is#Saptarshi";
		
	    char c = input.chars()
	    	      .mapToObj(x -> (char) x)
	    	      .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
	    	      .entrySet()
	    	      .stream()
	    	      .max(Entry.comparingByValue())
	    	      .get()
	    	      .getKey();

	      System.out.println(c);
	}
}

