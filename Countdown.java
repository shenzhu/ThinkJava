
public class Countdown {

	/**
	 * @param args
	 */
	public static void countdown(int n){
		if(n == 0){
			System.out.println("Blastoff!");
		}else{
			System.out.println(n);
			countdown(n - 1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countdown(10);
	}

}
