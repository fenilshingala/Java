package variableLengthArguments;

public class JaquiesSauniere {
	
	public static void main(String[] args){
		System.out.println(add(1,2,3,4));
	}
	public static int add(int...num){
		int total = 0;
		for(int k:num){
			total += k;
		}
		return total;
	}
	
}
