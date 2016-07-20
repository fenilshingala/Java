import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Nothing extends JFrame{
	private JButton button;
	private Color color;
	private JPanel panel;
	
	public Nothing(){
		super("Title!!");
		panel = new JPanel();
		
		button = new JButton("Press here.!");
		button.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent ev){
						color = JColorChooser.showDialog(null, "Choose a Color", color);
						if(color == null)
							color=(Color.WHITE);
						
						panel.setBackground(color);
					} 
				}
		);
		
		add(panel, BorderLayout.CENTER);
		add(button, BorderLayout.SOUTH);
		setSize(400, 400);
		setVisible(true);
	}
}