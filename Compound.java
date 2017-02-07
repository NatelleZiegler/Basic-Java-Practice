public class Compound {
	public static void main(String[] args) {
		int x = 6;
		x += 6;
		System.out.println("The value should be 12 and it is " + x);
		
		int amount = 10;
		amount -=4;
		System.out.println("The value should be 6 and it is " + amount);
		
		int y = 2;
		y *= 4;
		System.out.println("The value should be 8 and it is " + y);
		
		int total = 27;
		total /= 27;
		System.out.println("The value should be 1 and it is " + total);
		
		x %= 7;
		System.out.println(x);
	}
}