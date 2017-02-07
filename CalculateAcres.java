public class CalculateAcres {
	public static void main(String[] args) {
		double acre = 43560;
		double tract = 389767;
		double numAcres = 0;
		
		numAcres = tract / acre;
		System.out.println("The land has " + numAcres + " acres.");
	}
}