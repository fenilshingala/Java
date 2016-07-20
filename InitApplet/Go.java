import java.awt.*;
import javax.swing.*;

public class Go extends JApplet{
	
		private double sum;
	
		public void init(){
			String a = JOptionPane.showInputDialog("Enter number1: ");
			String b = JOptionPane.showInputDialog("Enter number2:");
			
			double num1 = Double.parseDouble(a);
			double num2 = Double.parseDouble(b);
			
			sum = num1 + num2;
		}
		
		public void paint(Graphics g){
			super.paint(g);
			g.drawString("Sum is: " + sum, 10, 10);
		}
		
}
