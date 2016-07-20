import javax.swing.JFrame;

public class Emma {
	public static void main(String[] args){
		
		Watson wObj = new Watson();
		wObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		wObj.setSize(800, 600);			// ( breadth, height )
		wObj.setVisible(true);
		
	}
}
