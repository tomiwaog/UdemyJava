//COnstructor runs every time i create an instance of my class
class Machine {

	private String name;
	private int code;

	// A Method must have a return type, but Constructor Doesnt
	// Name of constructor must be the same name of its Class
	public Machine() {
		this("Testname", 0); //If empty
		System.out.println("Constructor running!");
	}

	public Machine(String name) {
		this(name, 0);
		System.out.println("Second Constructor running!");
		this.name = name; // This refers class variable
	}

	public Machine(String name, int code){
		System.out.println("Third Construtor Now running!");
		this.name = name;
		this.code = code;
	}
}

public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Machine Machine1 = new Machine(); // Runs the machine Class
		Machine machine2 = new Machine("Machine 2 Annnie");
		Machine machine3 = new Machine ("Machine 3 Tom", 419);
	}

}
