import java.util.*;

public class Cool {
	public static void main(String[] args){
		
		PriorityQueue<String> qu = new PriorityQueue<String>();
		
		qu.offer("1st");
		qu.offer("2nd");
		qu.offer("3rd");
		
		System.out.printf("%s\n%s\n", qu, qu.peek());
		
		qu.poll();
		System.out.printf("%s", qu);
		
	}
}
