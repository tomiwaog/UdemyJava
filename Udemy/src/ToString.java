class Frogs{
	private String name;
	private int id;
	

	public Frogs(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
		//return "ID: "+id + ": " + name; //too many strings doesnt look good use BUILDER
		
		/* BETTER
		StringBuilder sb = new StringBuilder();
		sb.append(id)
		.append(" ")
		.append(name);
		return sb.toString();
		*/
		
		//Even Better and Shorter
		return String.format("%-4d: %s", id, name);
	}

}
public class ToString {

	public static void main(String[] args) {
		Frogs frog1 = new Frogs(5, "Berties");
		Frogs frog2 = new Frogs(8, "Roger");
		
		System.out.println(frog1);
		System.out.println(frog2);
	}

}
