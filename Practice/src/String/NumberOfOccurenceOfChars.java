package String;

import java.util.Map;
import java.util.stream.Collectors;

public class NumberOfOccurenceOfChars {

	public static void main(String[] args) {
		
String input = "My name is Saptarshi";
		
	   input.chars()
	    	      .mapToObj(x -> (char) x)
	    	      .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
	    	      .entrySet().stream().forEach(e-> System.out.println(e));;
	    
	}
}
