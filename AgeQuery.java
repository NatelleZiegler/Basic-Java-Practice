import javax.swing.JOptionPane;

public class AgeQuery {
	public static void main(String[] args) {
		String number; //for getting input from dialog box
		int age;  //for storing user's age
		
		number = JOptionPane.showInputDialog("Enter your age."); //opens dialog box prompting user for age
		age = Integer.parseInt(number);
		
		System.out.println("You were born " + age + " years ago.");
		
	}
}