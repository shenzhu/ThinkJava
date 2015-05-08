
public class MyExp2 {

	/**
	 * @param args
	 */
	public static double myexp2(int x, int n){
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = myexp2(1, 2);
		
		System.out.println(result);
	}

}
