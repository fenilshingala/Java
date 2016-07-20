import java.util.*;

public class Xyz {
	
	public static void main(String[] args){
		String[] str = {"hell", "kitchen", "nelson", "murdock"};
		List<String> ls1 = new ArrayList<String>();
		ls1 = Arrays.asList(str);
		
		List<String> ls2 = new ArrayList<String>();
		ls2.add("wilson");
		ls2.add("fisk");
		//ls2.add("hell");
		
		System.out.println(Collections.frequency(ls1, "nelson"));
		
		boolean bl = Collections.disjoint(ls1, ls2);
		System.out.println(bl);	
	}
	
}
