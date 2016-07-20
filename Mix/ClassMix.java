import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class ClassMix {
	
	public ClassMix(){
		
		JFrame frame = new JFrame();
		
		String[] seasonList = {"Arrow", "Flash", "BBT", "GOT", "BreakingBad", "Narcos"};
		JPanel comboPanel = new JPanel();
		JComboBox seasons = new JComboBox(seasonList);
		JLabel label = new JLabel("ThisIsLabel");
		comboPanel.add(label);
		comboPanel.add(seasons);
		frame.add(comboPanel, BorderLayout.CENTER);
		
		String[] movieList = {"Bourne", "POC", "Sherlock", "Lucy", "Blow", "Skyfall"};
		JPanel listPanel = new JPanel();
		listPanel.setVisible(false);
		JList ls = new JList(movieList);
		JLabel lab = new JLabel("AnotherLabel");
		listPanel.add(lab);
		listPanel.add(ls);
		frame.add(listPanel, BorderLayout.NORTH);
		
		JButton button = new JButton("button");
		button.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent ev){
						comboPanel.setVisible(!comboPanel.isVisible());
						listPanel.setVisible(!listPanel.isVisible());
					}
				}
		);
		frame.add(button, BorderLayout.SOUTH);
		
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args){
		
		ClassMix obj = new ClassMix();
		
	}
}
