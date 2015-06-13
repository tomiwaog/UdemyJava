import java.util.Scanner;

//A game that guesses my age

public class DoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value = 0;
		int age = 26;
/* //Using While ALONE
		 while(value != age)
		 { System.out.print("Guess my age: "); 
		 value =  scanner.nextInt(); }
*/
		
 //USING DO WHILE
		do {
			System.out.print("Guess my age: ");
			value = scanner.nextInt();
		} while (value != age);

		System.out.println("You guessed my age, It's " + age);
	}

}
