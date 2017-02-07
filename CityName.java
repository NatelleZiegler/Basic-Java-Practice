import java.util.*;
public class CityName {
	public static void main(String[] args) {
		String city = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your favorite city?");
		city = scan.nextLine();
		
		int citySize = city.length();
		String cityCaps = city.toUpperCase();
		String cityLower = city.toLowerCase();
		char cityLetter = city.charAt(0);
		
		System.out.println(citySize);
		System.out.println(cityCaps);
		System.out.println(cityLower);
		System.out.println(cityLetter);
	}
}