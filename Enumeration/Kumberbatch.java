public enum Kumberbatch {
	Anushka("sexy", "1"),
	Natlie("pretty", "2"),
	Shraddha("cute", "3"),
	Daenerys("hot", "4");
	
	private final String desc;
	private final String num;
	
	Kumberbatch(String description, String number){
		desc = description;
		num = number;
	}
	public String getDesc(){
		return desc;
	}
	public String getNum(){
		return num;
	}
	
}