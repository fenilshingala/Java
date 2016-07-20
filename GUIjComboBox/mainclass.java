import javax.swing.JFrame;

public class mainclass extends JFrame{
	
	public static void main(String[] args)
	{
		System.out.println(gui.class.getResource("a.png"));
		
		gui obj = new gui();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setSize(600,600);
		obj.setVisible(true);
	}
	
}
