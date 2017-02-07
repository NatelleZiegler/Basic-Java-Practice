import java.util.Scanner;

public class SalesTax {
	public static void main(String[] args) {
		double state = .04; //variables
		double county = .02;
		double totalTax = 0.0;
		double totalPrice = 0.0;
		double price = 0.00;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How much was your item?"); //asking the user the price of the item
		price = scan.nextDouble();
		scan.nextLine();
		
		//compute the tax and totals
		state = state * price;
		county = county * price;
		totalTax = state + county;
		totalPrice = totalTax + price;
		
		System.out.println("The total tax is " + totalTax + " and the total price is " + totalPrice);
		
	}
}