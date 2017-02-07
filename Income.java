import java.util.Scanner;

public class Income {
	public static void main(String[] args) {
		double income = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your desired income.");
		income = scan.nextDouble();
		scan.nextLine();
		System.out.println("You want to make " + income);
	}
}