
public class Palindrome {

	/**
	 * @param args
	 */
	public static char first(String a){
		return a.charAt(0);
	}
	
	public static char last(String a){
		int length = a.length();
		
		return a.charAt(length - 1);
	}
	
	public static String middle(String a){
		int length = a.length();
		
		if(length <= 2){
			return "";
		}else{
			return a.substring(1, length - 1);
		}
	}
	
	public static boolean isPalindrome(String a){
		int length = a.length();
		
		if(length <= 1){
			return true;
		}
		
		if(length == 2){
			if(a.charAt(0) == a.charAt(1)){
				return true;
			}else{
				return false;
			}
		}
		
		int i = 0;
		while(i <= length / 2){
			if(a.charAt(i) != a.charAt(length - 1 - i)){
				return false;
			}
			
			i++;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "otto";
		String b = "palinmordnilap";
		
		if(isPalindrome(a)){
			System.out.println("True");
		}
		
		if(isPalindrome(b)){
			System.out.println("True");
		}

	}

}
