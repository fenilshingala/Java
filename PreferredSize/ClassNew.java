import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClassNew {
	public static void main(String[] args){
		
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("LaBeL");
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		label.setBorder(border);
		label.setPreferredSize(new Dimension(50, 50));	// comment this line & see the difference
		frame.add(label);
		frame.setVisible(true);
		
	}
}
