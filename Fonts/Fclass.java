import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Fclass extends JPanel{

	String[] font = {"Serif", "SansSerif"};
	int[] style = {Font.PLAIN, Font.BOLD, Font.ITALIC, Font.BOLD + Font.ITALIC};
	String[] styleStr = {"Plain", "Bold", "Italic", "Bold+Italic"};
	
	public void paint(Graphics g){
		
		for(int i=0; i<font.length; i++){
			for(int j=0; j<style.length; j++){
				Font f = new Font(font[i], style[j], 20);
				g.setFont(f);
				g.drawString(font[i] + " " + styleStr[j], 10, (i * 4 + j + 1) * 20);
			}
		}
		
	}
	
	public static void main(String[] args){
		JFrame jf = new JFrame();
	/*	jf.addWindowListener(
				new WindowAdapter(){
					public void windowClosing(WindowEvent e){
						System.exit(0);
					}
				}	
		);	*/
		
		jf.setContentPane(new Fclass());
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(500, 500);
		jf.setVisible(true);
	}
	
}
