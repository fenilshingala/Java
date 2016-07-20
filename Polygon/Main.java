import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JPanel {
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		Polygon p = new Polygon();
		for(int i=1; i<=5; i++){
			p.addPoint((int) (100 + 50 * Math.cos(2*i*Math.PI/5)), (int) (100 + 50 * Math.sin(2*i*Math.PI/5)) );
		}
		g.drawPolygon(p);
	}
	
	public static void main(String[] args){
		JFrame frm = new JFrame();
		frm.setTitle("Title..!");
		frm.setSize(300, 300);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container pane = frm.getContentPane();
		pane.add(new Main());
		frm.setVisible(true);
	}
}
