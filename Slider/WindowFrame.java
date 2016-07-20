import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class WindowFrame extends JFrame{
	
	private JSlider slide;
	private OvalPanel pane;
	
	WindowFrame(){
		super("title!!");
		pane = new OvalPanel();
		pane.setBackground(Color.YELLOW);
		
		slide = new JSlider(SwingConstants.HORIZONTAL, -10, 100, 10);
		slide.setMajorTickSpacing(10);
		slide.setPaintTicks(true);
		
		slide.addChangeListener(
				new ChangeListener(){
					public void stateChanged(ChangeEvent e){
						pane.D(slide.getValue());
					}
				}
		);
		
		add(pane, BorderLayout.CENTER);
		add(slide, BorderLayout.SOUTH);
	}
	
}