import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui extends JFrame{
	
	private FlowLayout layout;
	private JTextField tf; 
	private JCheckBox Bold;
	private JCheckBox Italic;
	
	gui()
	{
		 super("Title");
		 
		 layout = new FlowLayout();
		 setLayout(layout);
		 layout.setAlignment(FlowLayout.LEFT);
		 
		 
		 tf = new JTextField("Bruce Wayne!", 10);
		 tf.setFont(new Font("Serif", Font.PLAIN, 14));
		 add(tf);
		 
		 Bold = new JCheckBox("Bold");
		 Italic = new JCheckBox("Italic");
		 add(Bold);
		 add(Italic);
		 
		 Hclass Handler = new Hclass();
		 
		 Bold.addItemListener(Handler);
		 Italic.addItemListener(Handler);
	}
	
	private class Hclass implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			Font font = null;
			
			if(Bold.isSelected())
				font = new Font("Serif", Font.BOLD, 14);
			else if(Italic.isSelected())
				font = new Font("Serif", Font.ITALIC, 14);
			else if(Italic.isSelected() && Bold.isSelected())
				font = new Font("Serif", Font.ITALIC + Font.BOLD, 14);
			else
				font = new Font("Serif", Font.PLAIN, 14);
			
			tf.setFont(font);
		}
	}
	
}
