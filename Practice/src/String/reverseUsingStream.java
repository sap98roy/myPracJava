package String;

public class reverseUsingStream {

	public static void main(String[] args) {
		
		    String str = "programming";
		    String res = str. chars()
		              .mapToObj(c -> (char) c)
		              .collect(StringBuffer::new, StringBuffer::append, StringBuffer::append)
		              .reverse()
		              .toString();
		    
		    System.out.println("reverse: " + res);  
		
	}
}
