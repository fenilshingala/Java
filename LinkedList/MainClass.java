import java.util.*;

public class MainClass {
	public static void main(String[] args){
		
		String[] s1 = {"bat", "flash", "aqua", "wonder", "cyborg"};
		List<String> ls1 = new LinkedList<String>();
		for(String x : s1)
			ls1.add(x);
		
		String[] s2 = {"theJoker", "HarleyQuinn", "bat"};
		List<String> ls2 = new LinkedList<String>();
		for(String y : s2)
			ls2.add(y);
		
		ls1.addAll(ls2);
		ls2 = null;
		
		printLs(ls1);
		remove(ls1, 2, 5);
		printLs(ls1);
		reverse(ls1);
		
	}
	
	public static void printLs(List<String> c1){
		for(String s : c1)
			System.out.printf("%s  ", s);
		System.out.println();
	}
	
	public static void remove(List<String> ls, int x, int y){
		ls.subList(x, y).clear();
	}
	
	public static void reverse(List<String> l){
		ListIterator<String> lItr = l.listIterator(l.size());
		while(lItr.hasPrevious())
			System.out.printf("%s ", lItr.previous());
		System.out.println();
	}
	
}
