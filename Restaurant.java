import java.util.Scanner;
public class Restaurant {
	public static void main(String[] args) {
		double meal = 0;
		double taxCharge = 0;
		double tip = 0;
		double total = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the cost of your meal.");
		
		meal = scan.nextDouble();
		scan.nextLine();
		
		taxCharge = meal * 0.0675;
		tip = (meal + taxCharge) * .15;
		total = meal + taxCharge + tip;
		
		System.out.println("Your total is " + total);
		System.out.println("Your meal was " + meal);
		System.out.println("Your tax was " + taxCharge);
		System.out.println("Your tip was " + tip);
	}
}