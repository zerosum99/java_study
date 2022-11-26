package comareTest;

public class StudentTest {


	public static void main(String[] args)  {
 
		Student a = new Student(17, 2);	// 17살 2반
		Student b = new Student(18, 1);	// 18살 1반
		
	    System.out.println(a.compareTo(b));
	    
	    Student1 a1 = new Student1(17, 2);	// 17살 2반
		Student1 b1 = new Student1(18, 1);	// 18살 1반
		
	    System.out.println(a1.compareTo(b1));
	    
	    Student2 a2 = new Student2(17, 2);	// 17살 2반
		Student2 b2 = new Student2(18, 1);	// 18살 1반
		
	    System.out.println(a2.compareTo(b2));
	    
	    
	}
}