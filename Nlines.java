
public class Nlines {

	/**
	 * @param args
	 */
	public static void nLines(int n){
		if(n > 0){
			System.out.println("");
			nLines(n - 1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nLines(5);
	}

}
