import java.util.EnumSet;

public class Beneddict {
	
	public static void main(String[] args){
		for(Kumberbatch sexies: Kumberbatch.values())
			System.out.printf("%s %s %s\n", sexies, sexies.getDesc(), sexies.getNum());
		
		System.out.println();
		
		for(Kumberbatch people: EnumSet.range(Kumberbatch.Natlie, Kumberbatch.Shraddha))
			System.out.printf("%s %s %s\n", people, people.getDesc(), people.getNum());
	}
}