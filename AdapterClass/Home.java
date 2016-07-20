import javax.swing.JFrame;

public class Home {
	public static void main(String[] args){
		GUI guiObj = new GUI();
		guiObj.setSize(300, 200);
		guiObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiObj.setVisible(true);
	}
}