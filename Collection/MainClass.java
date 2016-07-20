import java.util.*;

public class MainClass {
	public static void main(String[] args){
		
		String[] x = {"pen", "pencil", "eraser", "scale"};
		List<String> ls1 = new ArrayList<String>(Arrays.asList(x));			// passing list wrapper of x array into argument
		/*for(String p : x){												// instead of for loop
			ls1.add(p);
		}*/
		
		String[] y = {"pen", "scale"};
		List<String> ls2 = new ArrayList<String>();
		for(String q : y){
			ls2.add(q);
		}
		
		for(int i=0; i<ls1.size(); i++){
			System.out.printf("%s ", ls1.get(i));
		}
		System.out.println();
		
		for(int i=0; i<ls2.size(); i++){
			System.out.printf("%s ", ls2.get(i));
		}
		System.out.println();
		
		editItems(ls1, ls2);
		
		for(int i=0; i<ls1.size(); i++){
			System.out.printf("%s ", ls1.get(i));
		}
		System.out.println();
		for(String p : x){									// original x array is unchanged
			System.out.print(p+", ");
		}
	
	}
	
	
	public static void editItems(Collection<String> c1, Collection<String> c2){
		Iterator<String> itr = c1.iterator();
		while(itr.hasNext()){
			if(c2.contains(itr.next()))
				itr.remove();
		}
	}
	
	
}
