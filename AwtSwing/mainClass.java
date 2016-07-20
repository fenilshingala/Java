import java.awt.*;

import javax.swing.JFrame;

public class mainClass extends Frame{
	
	mainClass(){
		super("Title");
		Button b = new Button("Click");
		b.setBounds(50, 70, 150, 70);
		add(b);
		setSize(500, 500);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args){
		mainClass obj = new mainClass();
	}
}
