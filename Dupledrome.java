import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dupledrome {

	/**
	 * @param args
	 */
	public static boolean isDupledrome(String str){
		boolean flag = false;
		
		//create a HashMap
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		//convert the string to char array
		char[] chars = str.toCharArray();
		
		/*logic: char are inserted as keys and their count
		 * as values. If map contains the char already then 
		 * increase the value by 1
		 */
		
		for(Character ch:chars){
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch) + 1);
			}else{
				map.put(ch, 1);
			}
		}
		
		//obtaining set of keys
		Set<Character> keys = map.keySet();
		
		/*Display count of chars if it is 
		 * greater than 1. All duplicate chars would be
		 * having value greater than 1.
		 */
		for(Character ch:keys){
			if(map.get(ch) > 1){
				flag = true;
				System.out.println("Char " + ch + " " + map.get(ch));
			}
		}
		
		return flag;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(isDupledrome("llaammaa")){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
	}

}
