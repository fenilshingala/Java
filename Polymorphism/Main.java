public class Main {
	public static void main(String args[]){
		Digest dobj = new Digest();
		Food fobj = new Food();			//  food is abstract class
		Food obj[] = new Food[2];
		obj[0] = new Nutella();
		obj[1] = new Rocher();
		
		dobj.fun(fobj);
		dobj.fun(obj[0]);		// passing nutella to food argument
	/*	obj[0].eat();
		obj[1].eat();	*/
		for(Food f: obj)		// when no of args is unknown
		{
			f.eat();
		}
		
		
		Nutella nobj = new Nutella();
		Rocher robj = new Rocher();
		FoodList flobj = new FoodList();
		flobj.add(nobj);
		flobj.add(robj);
		
	}
} 