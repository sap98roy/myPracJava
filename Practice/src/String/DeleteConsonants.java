package String;

import java.util.regex.Pattern;

public class DeleteConsonants {
    
    
	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile("[^AaeEiIoOuU]");
		
		//for removing vowel do Pattern.compile("[AaeEiIoOuU]")

		String in = "Ram";

		String res = p.matcher(in).replaceAll("");
		
		System.out.println(res);
	}

}
