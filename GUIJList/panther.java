import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class panther extends JFrame{
	
	private JList list;
	private String[] colorName = {"Black","Blue","Red","Green"};
	private Color[] color = {Color.BLACK, Color.BLUE, Color.RED, Color.GREEN};
	
	public panther()
	{
		super("Title Bar!!!");
		setLayout(new FlowLayout());
		
		list = new JList(colorName);
		list.setVisibleRowCount(3);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list));
		
		list.addListSelectionListener(
				new ListSelectionListener(){
					public void valueChanged(ListSelectionEvent event){
						getContentPane().setBackground(color[list.getSelectedIndex()]);
					}
				}
		);
		
	}
	
}