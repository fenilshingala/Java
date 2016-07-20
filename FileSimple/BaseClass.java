import java.io.File;

public class BaseClass {
	public static void main(String[] args){
		File x = new File("/Users/fenilshingala/Desktop/new.txt");
		if(x.exists())
			System.out.println(x.getName() + "already exist!");
		else
			System.out.println("File created!");
	}
}
