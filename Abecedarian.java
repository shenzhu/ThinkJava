
public class Abecedarian {

	/**
	 * @param args
	 */
	public static boolean isAbecedarian(String a){
		int length = a.length();
		
		int i = 0;
		while(i < length - 2){
			if(Character.toLowerCase(a.charAt(i)) > Character.toLowerCase(a.charAt(i + 1))){
				return false;
			}
			
			i++;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] testArray = {"befist", "diluvy", "asdConversion"};
		
		for(int i = 0; i < testArray.length; i++){
			if(isAbecedarian(testArray[i])){
				System.out.println("True");
			}else{
				System.out.println("False");
			}
		}
	}

}
