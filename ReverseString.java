
public class ReverseString {

	/**
	 * @param args
	 */
	public static String reverseString(String a){
		String backwards = "";
		
		for(int i = a.length() - 1; i >= 0; i--){
			backwards += a.charAt(i);
		}
		
		return backwards;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String backwards = reverseString("Allen Downey");
		System.out.println(backwards);
	}

}
