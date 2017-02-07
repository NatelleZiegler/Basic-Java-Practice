public class StringPlay {
	public static void main(String[] args) {
		String city = "San Fransisco";
		int stringLength = 0;
		
		stringLength = city.length();
		System.out.println(city + " is " + stringLength + " characters long.");
		
		char oneChar;
		oneChar = city.charAt(0);
		System.out.println("It begins with the letter " + oneChar);
		
		String upperCity;
		upperCity = city.toUpperCase();
		
		String lowerCity;
		lowerCity = city.toLowerCase();
		
		System.out.println(upperCity + " " + lowerCity);
	}
}