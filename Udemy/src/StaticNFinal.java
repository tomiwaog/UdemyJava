class Thing{
	
	//FInal is java's version of constant (not changeable)
	public final static int LUCKY_NUMBER = 7;
	public String name;
	public static String description;
	
	//Every static belongs to the class and not the object
	//Can be used to count number of times object is created
	public static int count = 0;
	 
	//Count Can also be used to assign ID to new objects created 
	public int id;
	public Thing(){
		id = count; //ID is now equal to count
		count++;
	}
	public void showName(){
		System.out.println("Object ID: "+ id+ ", "+description + ": "+name);
	}
	 
	//Static method can only display another static data
	public static void showInfo(){
		System.out.println(description);//showInfo() is static + can access description which is also static
		//System.out.println(name); //this wont work as static can't access not static data
	}
}
public class StaticNFinal {

	public static void main(String[] args) {
		
		Thing.description = "I am a Thing Class";
		
		Thing.showInfo();
		
		System.out.println("Before creating objects, count is: "+Thing.count);
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		System.out.println("Before creating objects, count is: "+Thing.count);

		thing1.name = "Bob";
		thing2.name = "Sue";	
	
		thing1.showName();
		thing2.showName();
				
		System.out.println(Math.PI); //Example of static data
		
		System.out.println(Thing.LUCKY_NUMBER); //COnstants are written in uppercase
	}

}
