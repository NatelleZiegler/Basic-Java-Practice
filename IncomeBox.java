import javax.swing.JOptionPane;

public class IncomeBox {
	public static void main(String[] args) {
		double income;
		String str;
		str = JOptionPane.showInputDialog("Enter your desired income.");
		income = Double.parseDouble(str);
		System.out.println(income);
	}
}