import javax.swing.JFrame;

public class mainClass{
	public static void main(String[] args){
		
		gui obj = new gui();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setSize(300,300);
		obj.setVisible(true);
	}
}