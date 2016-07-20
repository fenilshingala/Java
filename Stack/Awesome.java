import java.util.*;

public class Awesome {
	public static void main(String[] args){
		
		Stack<String> stc = new Stack<String>();
		
		stc.push("abc");
		printSt(stc);
		stc.push("def");
		printSt(stc);
		
		stc.pop();
		printSt(stc);
		stc.pop();
		printSt(stc);
		
	}
	
	public static void printSt(Stack s){
		if(s.isEmpty())
			System.out.println("Stack is Empty");
		else
			System.out.printf("%s TOP\n", s);
	}
	
}
