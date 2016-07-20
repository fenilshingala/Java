import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class Mark extends JFrame{
	
	private JTextField f1;
	private JTextField f2;
	private JTextField f3;
	private JPasswordField p1;
	
	public Mark(){
		super("Title");
		setLayout(new FlowLayout());
		
		f1 = new JTextField(10);
		add(f1);
		
		f2 = new JTextField("Enter Text here");
		add(f2);
		
		f3 = new JTextField("uneditable",10);
		f3.setEditable(false);
		add(f3);
		
		p1 = new JPasswordField("password");
		add(p1);
		
		handler hanObj = new handler();
		f1.addActionListener(hanObj);
		f2.addActionListener(hanObj);
		f3.addActionListener(hanObj);
		p1.addActionListener(hanObj);	
		}
	
		private class handler implements ActionListener{
				public void actionPerformed(ActionEvent ev){
					String st = "";
					if(ev.getSource() == f1)
						st = String.format("Field 1: %s", ev.getActionCommand());
					else if(ev.getSource() == f2)
						st = String.format("Field 2: %s", ev.getActionCommand());
					else if(ev.getSource() == f3)
						st = String.format("Field 3: %s", ev.getActionCommand());
					else if(ev.getSource() == p1)
						st = String.format("Password Field: %s", ev.getActionCommand());
					
					JOptionPane.showMessageDialog(null, st);	
				}
		}
}
