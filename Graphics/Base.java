import javax.swing.JFrame;

public class Base {
	public static void main(String[] args){
		JFrame f = new JFrame("Title here!");
		
		GOT obj = new GOT();
		f.add(obj);
		
		f.setVisible(true);
		f.setSize(200, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
