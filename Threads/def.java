import java.util.*;

public class def implements Runnable{		// runnable allows new Thread( new def("1") )
											// passing obj in Thread()
	private String name;
	private int num;
	private Random ran = new Random();
	
	public def(String str){
		name = str;
		num = ran.nextInt(999);
	}
	
	public void run(){
		try{
			System.out.printf("%s is sleeping for %d msec\n", name, num);
			Thread.sleep(num);
			System.out.printf("%s woke up\n", name);
		}catch(Exception ex){}
	}
	
}