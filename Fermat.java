
public class Fermat {

	/**
	 * @param args
	 */
	public static void checkFermat(int a, int b, int c, int n){
		double firstNumber = raiseToPow(a, n);
		double secondNumber = raiseToPow(b, n);
		double sum = raiseToPow(c, n);
		
		if (firstNumber + secondNumber == sum){
			System.out.println("God, Fermat is wrong!");
		}else{
			System.out.println("Yes, Fermat is right.");
		}
	}
	
	public static double raiseToPow(int a, int b){
		return Math.pow(a, b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkFermat(5, 2, 3, 4);
	}

}
