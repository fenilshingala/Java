import java.util.*;

public class MainClass {
	public static void main(String[] args){
		
		String[] str = {"got", "BB", "mrRobot", "narcos"};
		LinkedList<String> lLs = new LinkedList<String>(Arrays.asList(str));

		System.out.printf("%s ", lLs);
		System.out.println();
		
		for(String k : lLs)
			System.out.printf("%s ", k);
		System.out.println();
		
		lLs.add("deathnote");
		lLs.addFirst("daredevil");
		
		str = lLs.toArray(new String[lLs.size()]);
		
		for(String i : str)
			System.out.printf("%s ", i);
		
	}
}
