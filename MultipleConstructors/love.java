public class love {
	public static void main(String[] args){
		Portman port = new Portman();

		Natlie natobj = new Natlie(port);
		System.out.println(natobj);
		
		Portman p1 = new Portman();
		Portman p2 = new Portman(1);
		Portman p3 = new Portman(1,2);
		Portman p4 = new Portman(1,2,3);
		
		System.out.printf("%s\n", p1.military());
		System.out.printf("%s\n", p2.military());
		System.out.printf("%s\n", p3.military());
		System.out.printf("%s\n", p4.military());
	}
	
}