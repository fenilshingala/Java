public class Iglesias {
	private int hour = 1;
	private int minute = 2;
	private int second = 3;
	
	public void time(int hour, int minute, int second){		// 'this' takes local variable
		this.hour = ( (hour==0 || hour==24) ? 0 : hour );
		this.minute = ( (minute>=0 && minute<60) ? minute : 0 );
		this.second= ( (second>=0 && second<60) ? second : 0 );
	}
	
	public String show(){
		return String.format("%02d : %02d : %02d", hour, minute, second);
	}
	public void military(){
		System.out.printf("%02d : %02d : %02d %s\n", hour <= 12 ? hour : hour%12, minute, second, hour<12 ? "AM" : "PM" );
	}

}