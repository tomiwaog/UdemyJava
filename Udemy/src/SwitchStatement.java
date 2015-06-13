import java.util.Scanner;


public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your command");
		String myText = input.nextLine();
		myText = myText.toLowerCase();
		
		switch (myText) {
		case "start":
			System.out.println("Machine Started");
			break;
		case "stop":
			System.out.println("Machin Stopped");
		default:
			System.out.println("Command not recognized");
			break;
		}
	}

}
