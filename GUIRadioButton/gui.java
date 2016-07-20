import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui extends JFrame{
	
	private JTextField tf;
	private Font pf;
	private Font bf;
	private Font itf;
	private Font bif;
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton itb;
	private JRadioButton bib;
	private ButtonGroup grp;
	
	public gui()
	{
		super("Title");
		setLayout(new FlowLayout());
		
		tf = new JTextField("Harley Quinn!<3", 20);
		add(tf);
		
		pf = new Font("Serif", Font.PLAIN, 14);
		bf = new Font("Serif", Font.BOLD, 14);
		itf = new Font("Serif", Font.ITALIC, 14);
		bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		
		pb = new JRadioButton("Plain",true);
		bb = new JRadioButton("Bold",false);
		itb = new JRadioButton("Italic",false);
		bib = new JRadioButton("BOLD+italic",false);
		add(pb);
		add(bb);
		add(itb);
		add(bib);
		
		pb.addItemListener(new handlerClass(pf));
		bb.addItemListener(new handlerClass(bf));
		itb.addItemListener(new handlerClass(itf));
		bib.addItemListener(new handlerClass(bif));
		
		grp = new ButtonGroup();
		grp.add(pb);
		grp.add(bb);
		grp.add(itb);
		grp.add(bib);
	}
	
	private class handlerClass implements ItemListener{
		private Font font;
		
		public handlerClass(Font f){
			font = f;
		}
		public void itemStateChanged(ItemEvent event){
			tf.setFont(font);
		}
	}
	
}
