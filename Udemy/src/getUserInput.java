import java.util.Scanner;


public class getUserInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a floating point: ");
		double linetext = input.nextDouble();
		
		System.out.println("You entered: " + linetext);
	}

}
