package Wrapper.Wrapper;
import javax.swing.JOptionPane;
import java.lang.Double;
public class Wrapper {
	/**************************************************
	 * This program shows how to use the NaN method
	 * in wrapper class Double
	 * 
	 */
	
    public static void main(String[] args) {
    	
    	String message = "This program demonstrates how to use the NaN method in Double class";
		JOptionPane.showMessageDialog( null, message);
    	String num1str = JOptionPane.showInputDialog( null,"Enter name of num1");
    	String num2str = JOptionPane.showInputDialog( null,"Enter name of num2");
    	double n1 = Double.parseDouble(num1str);
    	double n2 = Double.parseDouble(num2str);
    	//Instantiate Divide
    	
    	Divide d1 = new Divide(n1, n2);
    	JOptionPane.showMessageDialog( null, d1.toString());
    	Divide d2 = new Divide();
    	JOptionPane.showMessageDialog( null, d2.toString());
    }

}
