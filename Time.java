
public class Time {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour;
		int minute;
		int second;
		
		//assign value
		hour = 23;
		minute = 43;
		second = 20;
		
		int secPast = 22 * 60 * 60 + 43 * 60 + second;
		int secLeft = 24 * 60 * 60 - secPast;
		double timeRatio = secPast / secLeft;
		
		System.out.print(hour);
		System.out.print(" : ");
		System.out.print(minute);
		System.out.print(" : ");
		System.out.println(second);

	}

}
