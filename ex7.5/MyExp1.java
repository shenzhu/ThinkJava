
public class MyExp1 {

	/**
	 * @param args
	 */
	public static int pow(int i, int n){
		int result = 1;
		
		while(n >= 0){
			result *= i;
			n--;
		}
		
		//System.out.println(result);
		return result;
	}
	
	public static int factorial(int n){
		int result = 1;
		
		int i = 1;
		while(i <= n){
			result *= i;
			i++;
		}
		
		//System.out.println(result);
		return result;
	}
	
	public static double myexp1(int x, int n){
		double result = 0;
		
		int i = 0;
		while(i < n){
			double temp = (double)pow(x, i) / (double)factorial(i);
			//System.out.println(temp);
			result += temp;
			i++;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Here Result");
		double result = myexp1(1, 5);
		
		//System.out.println("Result");
		System.out.println(result);

	}

}
