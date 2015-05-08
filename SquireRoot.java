
public class SquireRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = squireRoot(100);
		
		System.out.println(result);
	}
	
	public static double squireRoot(double a){
		double x0 = a / 2;
		double x1 = (x0 + a / x0) / 2;
		
		while(Math.abs(x0 - x1) >= 0.0001){
			x0 = x1;
			x1 = (x0 + a / x0) / 2;
		}
		
		return x1;
	}

}
