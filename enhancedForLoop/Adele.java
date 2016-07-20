package inhancedForLoop;

public class Adele {
	
	public static void main(String[] args){
		int a[] = {5, 6, 7, 8};
		alter(a);
		for(int z:a)
			System.out.println(z);
	}
	
	public static void alter(int x[]){		// static is required
		for(int i=0; i<x.length; i++)
			x[i]+=5;
	}
	
}
