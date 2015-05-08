
public class Check {

	/**
	 * @param args
	 */
	
	public static double myexp(double x, int n){
		int i = 1;
		
		double result = 1;
		double item = 1;
		
		while(i < n){
			
			item *= x;
			item /= i;
			result += item;
			System.out.println(item);
			
			i++;
		}
		
		return result;
	}
	
	public static void check(double x, int n){
		double value1 = Math.exp(x);
		double value2 = myexp(x, n);
		
		//System.out.print(x);
		//System.out.print(" ");
		//System.out.print(value1);
		//System.out.print(" ");
		//System.out.print(value2);
		//System.out.println();
		
		System.out.println(Double.toString(x) + " " + Double.toString(value1) + " " + Double.toString(value2));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check(0.1, 10);
		check(1, 10);
		check(10, 10);
		check(100, 10);
		
		check(-0.1, 10);
		check(-1, 10);
		check(-10, 10);
		check(-100, 10);

	}

}
