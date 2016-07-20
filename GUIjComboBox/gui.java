import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui extends JFrame{
	
	private JComboBox box;
	private JLabel pic;
	
	private String[] filename = {"a.png", "b.png"};
	private Icon[] pictures = { new ImageIcon(gui.class.getResource(filename[0])),
									new ImageIcon(getClass().getResource(filename[1])) };
					// Both Syntaxes: gui.class.getResources  &&
					//				  getClass().fetResources
	
	public gui()
	{
		super("Title!");
		setLayout(new FlowLayout());
		
		box = new JComboBox(filename);
		
		box.addItemListener(
				new ItemListener(){
						public void itemStateChanged(ItemEvent event){
							if(event.getStateChange() == ItemEvent.SELECTED)
								pic.setIcon(pictures[box.getSelectedIndex()]);
							}
				}
		);
		add(box);
		
		pic = new JLabel(pictures[0]);
		add(pic);
	}
	
}
