package CollectionsCode;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Number_of_Occourances {

	public static void main(String[] args) {
		
		String str = "My name is Saptarshi";
		
		
		
		//Number of Occurance
		
		Map<Character, Long> map = str.chars()   				//chars() : InputStream
									.mapToObj(c->(char)c)
									.collect(Collectors.groupingBy(c->c, Collectors.counting()));
		
		
		System.out.println(map);
		
		
		
		//Repeated number of chars
		
		Map<Character, Long> r = map.entrySet()
									.stream()
									.filter(m->m.getValue()>=2)
									.collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));
		
		
		System.out.println(r);
		
		
		
		//List of repetitive chars
		
		List<Character> rlist = map.entrySet()
									.stream()
									.filter(e->e.getValue()>=2)
									.map(Map.Entry::getKey)
									.collect(Collectors.toList());
		
		System.out.println(rlist);
	}
}
