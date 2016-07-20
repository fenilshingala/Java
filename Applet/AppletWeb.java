import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.net.*;
import java.applet.*;

/* --------------------------------------------------------- */
public class AppletWeb extends JApplet{

	private HashMap<String, URL> sites;
	private ArrayList<String> array;
	private JList ls;

	public void init(){
		sites = new HashMap<String, URL>();
		array = new ArrayList<String>();

		grabHTML();

		add(new JLabel("Choose a site:"), BorderLayout.NORTH);
		ls = new JList(array.toArray());

		ls.addListSelectionListener(
			new ListSelectionListener(){
				public void valueChanged(ListSelectionEvent ev){
					Object ob = ls.getSelectedValue();
					URL pageUrl = sites.get(ob);
					AppletContext browser = getAppletContext();
					browser.showDocument(pageUrl);
				}
			}
		);
		add(new JScrollPane(ls), BorderLayout.CENTER);

	}
/* --------------------------------------------------------- */


// get website list & info
	private void grabHTML(){
		String arrTitle;
		String siteAdd;
		URL url;
		int counter = 0;
		arrTitle = getParameter("title"+counter);

		while(arrTitle != null){
			siteAdd = getParameter("address"+counter);
			
			try{
				url = new URL(siteAdd);
				sites.put(arrTitle, url);
				array.add(arrTitle);
			}catch(MalformedURLException urlException){
				urlException.printStackTrace();
			}

			counter++;
			arrTitle = getParameter("title"+counter);
		}
	}
/* --------------------------------------------------------- */

}
