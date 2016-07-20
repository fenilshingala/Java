import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Button extends JFrame {
	private JButton j;
	private JButton k;
	
	public Button(){
		super("Title!");
		setLayout(new FlowLayout());
		
		j = new JButton("ButtonJ");
		add(j);
		
		Icon a = new ImageIcon(getClass().getResource("a.png"));
		Icon b = new ImageIcon(getClass().getResource("b.png"));
		
		k = new JButton("ButtonK", a);
		k.setRolloverIcon(b);
		add(k);
		
		Hclass h = new Hclass();
		j.addActionListener(h);
		k.addActionListener(h);	
	}
	
	private class Hclass implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			JOptionPane.showMessageDialog(null, String.format("%s", ev.getActionCommand()));
		}
	}
	
}
