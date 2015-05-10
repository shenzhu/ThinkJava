
public class CaptainCrunch {

	/**
	 * @param args
	 */
	public static String captainCrunch(String str, int n){
		String lowerCharSet = "abcdefghijklmnopqrstuvwxyz";
		String upperCharSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		char[] lowerChars = lowerCharSet.toCharArray();
		char[] upperChars = upperCharSet.toCharArray();
		
		String result = "";
		
		for(int i = 0; i < str.length(); i++){
			char temp = str.charAt(i);
			
			if(temp == ' '){
				result += temp;
			}else if(Character.isLowerCase(temp)){
				//System.out.println(temp);
				int index = lowerCharSet.indexOf(temp);
				//System.out.println(index);
				int newIndex = (index + n) % 26;
				result += lowerChars[newIndex];
			}else{
				int index = lowerCharSet.indexOf(temp);
				int newIndex = (index + n) % 26;
				result += upperChars[newIndex];
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aAAabbBb  bbZZzz";
		String result = captainCrunch(str, 13);
		
		System.out.println(result);
	}

}
