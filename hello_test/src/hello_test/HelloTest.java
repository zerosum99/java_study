package hello_test;

public class HelloTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Hello world");
		
		int num1 = 100;
		
		if (true) {
			//int num1 = 300;
			num1 += 200;
		    System.out.println("num1 = " + num1);
			
		}
		
		{
			int num2 = 333;
			System.out.println(" num2 = " + num2);
					
		}
		
		for (int i =0; i < 10 ; i++ ) {
			// int num1 = 999;  메서드 내의 지역변수는 동일한 이름으로 지정할 수 없음 
		}

	}

}
