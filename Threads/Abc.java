public class Abc {
	public static void main(String[] args){
		
		Thread t1 = new Thread( new def("1") );
		Thread t2 = new Thread( new def("2") );
		Thread t3 = new Thread( new def("3") );
		Thread t4 = new Thread( new def("4") );
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}
