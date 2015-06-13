
public class StringArrays {

	public static void main(String[] args) {
		String[] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		
		//Equivalent to the top method
		String [] fruits = {"apple", "banana", "pear", "kiwi"};
		
		//Iterating through Array using ForLoop with loop index
		//For the words Array
		for (int i = 0; i < words.length; i++){
			System.out.println(words[i]);
		}
		
		//LOVE THIS ONE
		//Another way to Iterate through array WITHOUT loop index
		//For the Fruits array
		for (String fruit: fruits){
			System.out.println(fruit);
		}
		
		
		//LEARN KIDS
		//int is primitive type as it has lower startletter
		int value = 0;
		
		
		//String is a NON-Primitive type, It's a Class (Capital letter at the start)
		String text = null; //text is a reference, an address with default value NULL
		
		String[] texts = new String[2]; //No memory
		
	}

}
