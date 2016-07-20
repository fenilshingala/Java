public class Fox {
	private String fname;
	private String lname;
	private static int total = 0;
	public Fox(String fn, String ln){
		fname = fn;
		lname = ln;
		total++;
		System.out.printf("%s %s \t Total: %d\n",fname, lname, total);
	}
}