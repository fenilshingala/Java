import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui extends JFrame{
	private JList left;
	private JList right;
	private JButton button;
	private static String[] movie = {"ArkhamAsylum", "Doom", "NewFrontier", "War", "crisisOnTwoEarth", "ThronesOfAtlantis", "DarkKnightReturns"};
	
	public gui()
	{
		super("Title");
		setLayout(new FlowLayout());
		
		left = new JList(movie);
		left.setVisibleRowCount(3);
		left.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(left));
		
		button = new JButton(" -> ");
		button.addActionListener(
				new ActionListener(){
					@SuppressWarnings({ "deprecation", "unchecked" })
					public void actionPerformed(ActionEvent ev){
						right.setListData(left.getSelectedValues());
					}
				}
		);
		add(button);
		
		right = new JList();
		right.setVisibleRowCount(3);
		right.setFixedCellHeight(18);
		right.setFixedCellWidth(150);
		right.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(right));
	}
}
