package stringtest;

public class stringtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("String Test "); 
		// create a string
		String type_ = "Java programming";
		System.out.println(type_); 
		
		// get the length of greet
	    int length = type_.length();
	    System.out.println("Length: " + length); 
	    
	    // create first string
	    String first = "Java ";
	    System.out.println("First String: " + first);

	    // create second
	    String second = "Programming";
	    System.out.println("Second String: " + second);

	    // join two strings
	    String joinedString = first.concat(second);
	    System.out.println("Joined String: " + joinedString);
	    
	    System.out.println("add operator =" + first+second); 
	    
	    String third = "python programming";

	    // compare first and second strings
	    boolean result1 = first.equals(second);
	    System.out.println("Strings first and second are equal: " + result1);
	    System.out.println(" == " + (first == "Java ")); 
	    
	    

	    // compare first and third strings
	    boolean result2 = first.equals(third);
	    System.out.println("Strings first and third are equal: " + result2);
	    
	    // create a string using the new keyword
	    String name = new String("Java String");
	    System.out.println(name);
	    
	    
	 

	}
	


}



