class PersonRace{
//Instance variables (data or "State")
String name;
int age;

//Classes can contain
//1. Data
//2. Subroutines (methods)
}
public class ClassesNObject {

	//Main Methods
	public static void main(String[] args) {

		PersonRace PersonRace1 = new PersonRace();
		PersonRace1.name = "Tomiwa Ogunbamowo";
		PersonRace1.age = 26;
		
		PersonRace PersonRace2 = new PersonRace();
		PersonRace2.name = "Tolu Ogunbowale";
		PersonRace2.age = 29;
		
		System.out.println(PersonRace1.name);
	}

}
