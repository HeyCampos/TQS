public class Bhaskara {

	public static double Calcula(int a, int b, int c) {
		// TODO Auto-generated method stub
		
		double delta, x1, x2;

		System.out.println("****************  BHASKARA  ****************\n");
		
		delta = (Math.pow(b, 2)) - (4 * (a) * (c));
		x1 = ((-b) + (Math.sqrt(delta))) / (2 * a);
		x2 = ((-b) - (Math.sqrt(delta))) / (2 * a);

		return x2;
	}
}
