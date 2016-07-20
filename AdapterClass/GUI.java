import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame{
	

	private String str;
	private JLabel label;
	
	public GUI(){
		super("Title");
		
		label = new JLabel("default!");
		add(label, BorderLayout.SOUTH);
		addMouseListener(new Mouseclass());
	}
	
		private class Mouseclass extends MouseAdapter{			// Adapter class
			
			public void mouseClicked(MouseEvent ev){
				str = String.format("Clicked %d", ev.getClickCount());
			
				if(ev.isMetaDown())
					str += " with Right Click";
				else if(ev.isAltDown())
					str += " with Center Click";
				else
					str += " with Left Click";
			
				label.setText(str);
			}
			
	}

		
}
