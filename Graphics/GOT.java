import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GOT extends JPanel{
	
	public void paintComponent(Graphics g){
		super.paintComponents(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.BLUE);
		g.drawLine(10, 10, 60, 30);
		
		g.setColor(Color.GRAY);
		g.fillRect(10, 50, 60, 30);
	}
}