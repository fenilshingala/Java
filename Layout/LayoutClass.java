import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class LayoutClass extends JFrame{
	
	private FlowLayout layout;
	private Container contain;
	private JButton l;
	private JButton r;
	private JButton c;
	
	public LayoutClass(){
		super("Title");
		
		layout = new FlowLayout();
		setLayout(layout);
		contain = getContentPane();
		
		l = new JButton("Left");
		add(l);
		l.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent ev){
						layout.setAlignment(FlowLayout.LEFT);
						layout.layoutContainer(contain);
					}
				}
		);
		
		c = new JButton("Center");
		add(c);
		c.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent ev){
						layout.setAlignment(FlowLayout.CENTER);
						layout.layoutContainer(contain);
					}
				}
		);
		
		r = new JButton("Right");
		add(r);
		r.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent ev){
						layout.setAlignment(FlowLayout.RIGHT);
						layout.layoutContainer(contain);
					}
				}
		);
		
	}
	
}
