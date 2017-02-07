public class StockTransaction {
	public static void main(String[] args) {
		final double SHARES = 1000;
		final double PURCHASE_PRICE = 32.87;
		final double SALE_PRICE = 33.92;
		final double COMMISSION = .02;
		
		double stockAmount = 0; //amount paid for stock
		double stockCommission = 0; //initial commission
		double stockAmountSale = 0; //amount sold for
		double stockCommissionSale = 0; //sale commission
		double profit = 0;
		
		stockAmount = SHARES * PURCHASE_PRICE;
		System.out.println("Joe paid " + stockAmount + " dollars for his stock.");
		
		stockCommission = COMMISSION * stockAmount;
		System.out.println("He paid his broker a " + stockCommission + " dollar commission.");
		stockAmountSale = SHARES * SALE_PRICE;
		System.out.println("He sold the stock for " + stockAmountSale + " dollars.");
		stockCommissionSale = stockAmountSale * COMMISSION;
		System.out.println("He paid his broker a " + stockCommissionSale + " dollar commission.");
		profit = (stockAmountSale + stockCommissionSale) - (stockAmount + stockCommission);
		
		System.out.println("He made " + profit + " dollars profit.");
		}
	}