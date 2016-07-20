import javax.swing.JFrame;

public class Home extends JFrame{
	
	public static void main(String[] args){
		GUI guiObj = new GUI();
		guiObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiObj.setSize(300, 200);
		guiObj.setVisible(true);
	}
	
}
