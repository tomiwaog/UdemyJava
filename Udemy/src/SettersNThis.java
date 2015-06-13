class Frog {

	// Encapsulation - hiding away the data (Use private to force it)
	// if private is added to the VARS this variable wont be accessible directed
	// i.e. example.age = "" wont work anymore
	// the method would have to be called. i.. example.getAge();
	private String name;
	private int age; // can be accessible to other classes if private is removed
	private String color; // if private is removed, it becomes PACKAGE

	// THe this refers to the Class property and
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age; // age = age will mean age in method = age in method
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setInfo(String name, int age, String color) {
		setName(name);
		setAge(age);
		this.setColor(color); // This can be used but most used for ambiguity
								// with name clashes on class variable & methods
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// Method returning String input
	public String getColor() {
		return color;
	}

}

public class SettersNThis {
	// Setters, Also known as Mutators
	// https://www.udemy.com/java-tutorial/#/lecture/139606
	public static void main(String[] args) {

		Frog frog1 = new Frog();

		// With the idea of setters, I wouldnt have to see or use internal
		// variables frog1.name = "Bertie"; frog1.age = 1; frog1.color = "red";
		// Since the color is set to Private, the next line will go red
		// (uncomment)
		// System.out.println(frog1.color); //setter wouldnt need this line

		frog1.setName("Bertie");
		frog1.setAge(7);
		frog1.setColor("Green");
		System.out.println("My name: " + frog1.getName());
		System.out.println("Frog age: " + frog1.getAge());
		System.out.println("Color: " + frog1.getColor());

	}

}
