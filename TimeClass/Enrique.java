public class Enrique {
	public static void main(String[] args){
		Iglesias i1 = new Iglesias();
		System.out.println(i1.show());
		Iglesias i2 = new Iglesias();
		System.out.println(i2.show());
		
		i1.time(5,30,28);
		i2.time(14, 48, 20);
		
		System.out.println(i1.show());
		System.out.println(i2.show());
		i1.military();
		i2.military();
	}
}