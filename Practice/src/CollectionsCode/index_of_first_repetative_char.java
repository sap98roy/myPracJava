package CollectionsCode;

public class index_of_first_repetative_char {

	public static void main(String[] args) 
	{
		
		String str = "abhsudva";
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) 
        {
            char character = str.charAt(i);
            int firstIndex = str.indexOf(character);
            int lastIndex = str.lastIndexOf(character);
            if(firstIndex != lastIndex) 
            {
                System.out.println(i);
                break; 
            }
        }
	}
}
	
