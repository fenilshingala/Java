import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

public class GUI extends JFrame{

	private JPanel pane;
	private JLabel label;
	
	GUI(){
		super("Title");
		
		pane = new JPanel();
		pane.setBackground(Color.white);
		add(pane, BorderLayout.CENTER);
		
		label = new JLabel();
		add(label, BorderLayout.SOUTH);
		
		HandlerClass handle = new HandlerClass();
		
		pane.addMouseListener(handle);
		pane.addMouseMotionListener(handle);
	}
	
	private class HandlerClass implements MouseListener, MouseMotionListener{
		// MouseListener events
		public void mouseClicked(MouseEvent ev){
			label.setText(String.format( "Coordinates: %d, %d", ev.getX(), ev.getY() ));
		}
		public void mousePressed(MouseEvent ev){
			label.setText("mousePressed");
		}
		public void mouseReleased(MouseEvent ev){
			label.setText("mouseReleased");
			pane.setBackground(Color.RED);
		}
		public void mouseEntered(MouseEvent ev){
			label.setText("mouseEntered");
			pane.setBackground(Color.GREEN);
		} 
		public void mouseExited(MouseEvent ev){
			label.setText("mouseExited");
		}
		
		// mouseMotionListener events:
		public void mouseDragged(MouseEvent ev){
			label.setText("mouseDragged");
		}
		public void mouseMoved(MouseEvent ev){
			label.setText("mouseMoved");
			pane.setBackground(Color.BLUE);
		}
	}
	
}
