import java.util.*;
public class Tests {
	public static void main(String[] args) {
		double testA;
		double testB;
		double testC;
		
		testA = 0;
		testB = 0;
		testC = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first test score.");
		testA = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("Please enter the second test score.");
		testB = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("Please enter the third test score.");
		testC = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("The three test scores were: " + testA + ", " + testB + ", & " + testC + ".");
		
		double average;
		average = 0;
		average = (testA + testB + testC) / 3;
		
		System.out.println("The test average is " + average + ".");
	}
}