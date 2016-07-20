import java.util.Random;

public class maroon {
	public static void main(String[] args){
		
		System.out.println(Math.abs(-50));
		System.out.println(Math.max(30, 35));
		System.out.println(Math.min(30, 35));
		System.out.println(Math.ceil(5.75));
		System.out.println(Math.floor(5.75));
		System.out.println(Math.pow(3, 3));
		System.out.println(Math.sqrt(64));

		Random r = new Random();
		int num;
		for(int i=0;i<6;i++)
		{
			num = 1+r.nextInt(6);
			System.out.println(num);
		}
	}
}
