import java.util.*;
public class WordGame {
	public static void main(String[] args) {
		String name = "";
		String city = "";
		String college = "";
		String profession = "";
		String animalType = "";
		String petName = "";
		int age = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name.");
		name = scan.nextLine();
		
		System.out.println("Enter your age.");
		age = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter the name of a city.");
		city = scan.nextLine();
		
		System.out.println("Enter the name of a college.");
		college = scan.nextLine();
		
		System.out.println("Enter a job title.");
		profession = scan.nextLine();
		
		System.out.println("Enter a type of animal.");
		animalType = scan.nextLine();
		
		System.out.println("Enter a name for a pet.");
		petName = scan.nextLine();
		
		System.out.println("There once was a person named " + name + " who lived in " + city + " ."
		+ " At the age of " + age + ", " + name + " went to college at " + college + ". " + name +
		" graduated and went to work as a " + profession + ". Then, " + name + " adopted a(n) " + animalType
		+ " named " + petName + ". They both lived happily ever after!");
	}
}