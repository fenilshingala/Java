public class MainClass {
	public static void main(String[] args){
		
		String[] s1 = {"game", "gag", "came"};
		String s = "Hello";
		
		for(String x : s1){
			if(x.startsWith("ga"))
				System.out.println(x + " starts with 'ga'..");
		}
		System.out.println();
		for(String t : s1){
			if(t.endsWith("me"))
				System.out.println(t + " ends with 'me'..");
		}
		
		System.out.println(s.indexOf('l',4));
		
	}
}
