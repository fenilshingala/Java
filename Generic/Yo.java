import java.util.*;

public class Yo {
	public static void main(String[] args){
		
		Integer[] i = {1, 2, 3, 4};
		Character[] c = {'a', 'b', 'c', 'd'};
		
		printThis(i);
		printThis(c);
		
	}
	
	public static <T> void printThis(T[] k){
		for(T x : k)
			System.out.printf("%s ", x);
		System.out.println();
	}
	
}
