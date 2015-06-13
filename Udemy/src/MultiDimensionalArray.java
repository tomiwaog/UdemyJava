public class MultiDimensionalArray {

	public static void main(String[] args) {

		// One Dimensional Array
		int[] values = { 3, 5, 224 };
		System.out.println(values[2]);

		int[][] grid = { { 3, 5, 224 }, { 2, 4 }, { 1, 2, 3, 4 } };

		System.out.println(grid[1][1]);
		System.out.println(grid[0][2]);

		// OR

		String[][] texts = new String[2][3];

		texts[0][1] = "Hello There";
		System.out.println(texts[0][1]);

		// Iterating through 2 dimensional Array
		for (int row = 0; row < grid.length; row++) {

			for (int col = 0; col < grid[row].length; col++) {
				System.out.print(grid[row][col] + "\t"); //T gives it a Tab
			}
			System.out.println();
			
			String [][] words = new String[2][]; //Will give null row
			System.out.println(words[0]);
			
			words[0] = new String[3];
			words[0][1] = "hi there";
			System.out.println(words[0][1]);
			
			
		}
	}

}
