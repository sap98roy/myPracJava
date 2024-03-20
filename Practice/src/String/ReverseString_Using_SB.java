package String;

public class ReverseString_Using_SB {

	public static void main(String[] args) {
		
		String str = "programming";
		StringBuffer sb = new StringBuffer(str);  
        
        System.out.println("reverse: " + sb.reverse().toString());  
	}
}
