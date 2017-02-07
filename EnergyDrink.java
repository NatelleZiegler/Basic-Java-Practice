public class EnergyDrink {
	public static void main(String[] args) {
		final double CUSTOMERS = 12467;
		final double PERCENT_WEEKLY = .14;
		final double PERCENT_CITRUS = .64;
		double weeklyCustomers = 0;
		double citrusCustomers = 0;
		
		weeklyCustomers = CUSTOMERS * PERCENT_WEEKLY;
		citrusCustomers = CUSTOMERS * PERCENT_CITRUS;
		
		System.out.println(weeklyCustomers + " of our customers buy drinks weekly.");
		System.out.println(citrusCustomers + " of our customers prefer citrus flavors.");
	}
}