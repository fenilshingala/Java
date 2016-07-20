import java.util.*;

public class Pretty {
	public static void main(String[] args){
		
		String[] str = {"yo", "hello", "bello", "hello"};
		List<String> ls = Arrays.asList(str);
		
		Set<String> set = new HashSet<String>(ls);
		System.out.printf("%s", set);
		
	}
}
