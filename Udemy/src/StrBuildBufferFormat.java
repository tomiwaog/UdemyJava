
class lol{
	
}
public class StrBuildBufferFormat {

	public static void main(String[] args) {
		
		//INEFFICIENT WAY TO BUILD STRING
		String info = "";
		info += "My name is Bob.";
		info += " ";
		info += "I am a builder.";
		System.out.println(info);
		
		
		//MORE INEFFICIENT (MEMORY) WAY TO BUILD STRING
		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a Lion tamer!");
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		//ANother way of appending String BUILDER
		s.append("My name is Tommie")
		.append(" ")
		.append("I am a computer scientist");	
		System.out.println(s.toString());
		
		/////////Formatting integers
		System.out.println("Here is some text.\t That was a tab \nThat was a new line");
		
		//Printf formatting - NICE - can use number between % for width and for spaces or (-)
		System.out.printf("I am %d years old with %4d babies", 26, 0);
		
		for (int i = 1; i<= 20; i++){
			System.out.printf("%2d: some text here. Number: %d\n", i, 5);
			
		}
		
		//Formatting floating point values
		System.out.printf("Total value: %.2f\n", 5.6887);
		//use -6 to align the spacing to left
		System.out.printf("More floats witht width: %6.1f\n", 343.284352); //the 6 represents width of all
		
	}

}
