import java.util.Scanner;
public class BoardProfit {
	public static void main(String[] args) {
		double profit = 0;
		double retail = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the retail price of the circuit board?");
		retail = scan.nextDouble();
		scan.nextLine();
		profit = retail * .4;
		System.out.println("Omnicorp is making a " + profit + " dollar profit off the circuit boards.");
	}
}