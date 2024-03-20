package String;

import java.util.Arrays;
import java.util.stream.Collectors;

public class reverseCharsOfString {

	public static void main(String[] args) {
		
		String input = "alex brian charles";

		String reversed = Arrays.stream(input.split(" "))
		    .map(word -> new StringBuilder(word).reverse())
		    .collect(Collectors.joining(" "));

		System.out.println(reversed);
	}
}
