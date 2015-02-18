	import javax.swing.JOptionPane;    // GUI dialogs
	public class adder
	{ 
	public static void main( String args[] )
	   {  String firstNumber,secondNumber,result;        
	         int number1,number2;  // read user numbers
	               firstNumber = JOptionPane.showInputDialog("Enter first integer:");
	               secondNumber = JOptionPane.showInputDialog("Enter second integer:" );         
// convert numbers
      number1 = Integer.parseInt( firstNumber );
      number2 = Integer.parseInt( secondNumber );
      result = number1 + " + " + number2 + " = " + (number1 + number2);    	        
      JOptionPane.showMessageDialog( null, result, "Add Results", JOptionPane.INFORMATION_MESSAGE );
        	                 } // end of main()
        	              } // end of Comparison class