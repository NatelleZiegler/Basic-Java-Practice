public class Stocks {
	public static void main(String[] args) {
		final double COMMISSION = .02;
		final double STOCK_PRICE = 21.77;
		double stockAmount = 0; //for total cost of stock
		double commissionAmount = 0;
		double total = 0;
		
		stockAmount = 600 * STOCK_PRICE; //calculate cost
		commissionAmount = stockAmount * COMMISSION;
		total = stockAmount + commissionAmount;
		
		System.out.println("Your total cost is " + total);
		System.out.println("You paid " + commissionAmount + " in commission.");
		System.out.println("You spent " + stockAmount + " on stocks.");
	}
}