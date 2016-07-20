package hello;
import java.util.Scanner;

public class Taylor {
	public static void main(String[] args){
		
		Swift SwiftObj = new Swift();
		float a, b, c;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = s.nextLine();
		SwiftObj.hellofun(name);

		System.out.print("Enter two float numbers: ");
		a = s.nextFloat();
		b = s.nextFloat();
		c = a + b;
		System.out.println("Addition of these two is: " + c);
		SwiftObj.function();
		
	}
}
