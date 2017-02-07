import java.util.Scanner;

public class TestScores {
	public static void main(String[] args) {
		double testA = 0;
		double testB = 0;
		double testC = 0;
		double average = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the score of the first test.");
		testA = scan.nextDouble();
		scan.nextLine();
		System.out.println("Please enter the score of the second test.");
		testB = scan.nextDouble();
		scan.nextLine();
		System.out.println("Please enter the score of the third test.");
		testC = scan.nextDouble();
		scan.nextLine();
		
		average = (testA + testC + testB) / 3;
		
		System.out.println("The test scores were " + testA + " , " + testB + " , " + "and " + testC + " .");
		System.out.println("The average of these test scores is " + average);
	}
}