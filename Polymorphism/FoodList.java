public class FoodList {
	Food[] flist = new Food[5];
	private int i = 0;
	public void add(Food f){
		flist[i] = f;
		System.out.println("Object added to list at position " + i);
		i++;
	}
}