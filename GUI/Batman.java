import javax.swing.JOptionPane;

public class Batman {
	public static void main(String[] args){
		
		String n1 = JOptionPane.showInputDialog("ENTER no.1: ");
		String n2 = JOptionPane.showInputDialog("ENTER no.2: ");
		
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		int n3 = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "Sum of two is: " + n3, "this is the Title", JOptionPane.PLAIN_MESSAGE);
		
	}
}
