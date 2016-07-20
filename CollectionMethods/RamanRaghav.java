import java.util.*;

public class RamanRaghav {
	public static void main(String[] args){
		
		String[] str = {"bhajiya", "locho", "panipuri", "fries"};
		List<String> ls = Arrays.asList(str);
		System.out.printf("%s", ls);
		System.out.println();
		
		Collections.sort(ls);
		System.out.printf("%s", ls);
		System.out.println();
		for(String x:str)
			System.out.print(x+", ");
		System.out.println();
		
		Collections.sort(ls, Collections.reverseOrder());
		System.out.printf("%s", ls);
		System.out.println();
		
		Collections.reverse(ls);
		System.out.printf("%s", ls);
		System.out.println();
		
		String[] cpyStr = new String[4];
		List<String> cpyLs = Arrays.asList(cpyStr);

		System.out.println("---------------------------------");
				
		Collections.copy(cpyLs, ls);
		System.out.printf("%s", cpyLs);
		System.out.println();
		
		Collections.fill(ls,"#");
		System.out.printf("%s", ls);
		System.out.println();
		
	}
}
