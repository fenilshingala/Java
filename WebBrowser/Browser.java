import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Browser extends JFrame{
	
	private JTextField address;
	private JEditorPane page;

	Browser(){

		super("Browser");
		
		address = new JTextField("URL");
		address.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ev){
					LoadPage(ev.getActionCommand());
				}
			}
		);
		add(address, BorderLayout.NORTH);

		page = new JEditorPane();
		page.setEditable(false);
		page.addHyperlinkListener(
			new HyperlinkListener(){
				public void hyperlinkUpdate(HyperlinkEvent ev){
					if(ev.getEventType() == HyperlinkEvent.EventType.ACTIVATED){
						LoadPage(ev.getURL().toString());
					}
				}
			}
		);
		add(new JScrollPane(page), BorderLayout.CENTER);
		setSize(500, 300);
		setVisible(true);

	}

	public void LoadPage(String str){
		try{
			page.setPage(str);
			address.setText(str);
		}catch(Exception e){
			System.out.println("Error DA!");
		}
	}

}
