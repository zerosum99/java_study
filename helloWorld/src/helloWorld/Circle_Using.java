package helloWorld;

import com.company.area.Circle;
//import com.company.circum.Circle; 


public class Circle_Using {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		com.company.area.Circle ac = new com.company.area.Circle(10);
		com.company.circum.Circle cc = new com.company.circum.Circle(20); 
		
		System.out.println(" Area = " + ac.getArea());
		System.out.println(" Circum = " + cc.getCircumrerence());
		

	}

}
