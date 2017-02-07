import java.util.Scanner;

public class MPG {
	public static void main(String[] args) {
		double miles = 0;
		double gas = 0;
		double mpg = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many miles did you drive?");
		miles =  scan.nextDouble();
		scan.nextLine();
		System.out.println("How much gas did you use?");
		gas = scan.nextDouble();
		scan.nextLine();
		mpg = miles / gas;
		
		System.out.println("Your car's miles per gallon is " + mpg);
		
	}
}