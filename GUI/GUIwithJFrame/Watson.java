import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Watson extends JFrame{			// extends
	
	private JLabel i1;
	
	public Watson(){
		
		super("This is Title");				// super only runs in constructor
		setLayout(new FlowLayout());
		
		i1 = new JLabel("This is Label - Hover here");
		i1.setToolTipText("you're HOvering stupid");
		add(i1);
		
	}
	
}