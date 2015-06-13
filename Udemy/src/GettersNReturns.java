class Person {

	String name;
	int age;

	void speak() {
		System.out.println("My name is " + name);
	}

	int calculateRetirment() {
		int retirementyear = 65;
		int yearsLeft = retirementyear - age;
		return yearsLeft;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}
}

public class GettersNReturns {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Tommie Kiddy";
		person1.age = 26;
		// person1.speak();

		String name = person1.getName();
		System.out.print("My name is " + name);
		
		int age = person1.getAge();
		System.out.println(", I'm " + age);

		int years = person1.calculateRetirment();
		System.out.println("Years till Retirement: " + years);

	}
}