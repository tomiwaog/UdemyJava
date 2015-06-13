class PersonClass {
	// Instance variables (data or "State")
	String name;
	int age;

	// Classes can contain
	// 1. Data
	// 2. Subroutines (methods)

	// Speak method
	void speak() {
		System.out.println("My name is " + name + ", I'm " + age);
	}
	
	void sayHello(){
		System.out.println("Hello there!");
	}
}

// Name of JavaClass
public class Methods {

	// Main Methods
	public static void main(String[] args) {

		// Objects belonging to class
		PersonClass PersonClass1 = new PersonClass();
		PersonClass1.name = "Tomiwa Ogunbamowo";
		PersonClass1.age = 26;
		System.out.println(PersonClass1.name);
		PersonClass1.sayHello();
		PersonClass1.speak();
		
		System.out.println();
		PersonClass PersonClass2 = new PersonClass();
		PersonClass2.name = "Tolu Ogunbowale";
		PersonClass2.age = 29;
		PersonClass2.sayHello();
		PersonClass2.speak();

		
	}

}
