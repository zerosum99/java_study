package java_Test1;

import java_Test1.test.*;
import java_Test1.inter.*;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		
		MyClass my = new MyClass();
		System.out.println(my.var);
		
	    Npc saram1 = new Npc();                //객체 생성 
	    saram1.name = "경비";
	    saram1.hp = 100;
	    saram1.say();
	    System.out.println(saram1.name+", "+ saram1.hp);
	    
	    User u = new User("user1", 33);
	    System.out.println(u.getName()+", " + u.getAge());
	    
	    Person p = new Person();               // 인터페이스를 구현해서 처리 
	    System.out.println(p.say());
	    
	    
	    Sayable a = new Animal();               // 인터페이스를 구현해서 처리 
	    System.out.println(a.say());
	    
	    System.out.println(((Animal)a).bark());   // 인터페이스를 자기 클래스로 변환한 후에 내부 메서드실행 


	}

}
