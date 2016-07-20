import java.awt.*;
import javax.swing.*;

public class OvalPanel extends JPanel{
	
	private int d = 10;
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.fillOval(10, 10, d, d);
	}
	
	public void D(int x){
		d = (x>=0 ? x : 10);
		repaint();
	}
	
}