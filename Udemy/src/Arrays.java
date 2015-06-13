import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int value = 7; // values is a bucket/ value is memory loc for value 7
		int[] values; // values is a reference /
		values = new int[3]; // allocates memory enough for 3 integers

		// Stores values in memory in array
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;

		// Prints values for each location in array
		//Remember length only work on list, and doesn't work on ArrayList (use size instead)
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		//initialising arrays as you declare it
		int[] numbers = {5, 6, 7};
		
		for (int j = 0; j <numbers.length; j++){
			System.out.println(numbers[j]);
		}
	}

}
