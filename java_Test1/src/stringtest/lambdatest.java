package stringtest;

public class lambdatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Lambda Test ");
		
		Func f = (int x, int y) -> x+y; 
		
		System.out.println(" lambda = " + f.func(100,200)); 
		
		
		
		Func af = new Func() {
            @Override
            public int func(int a, int b) {
                return a > b ? a : b;
            }
        };

        int max = af.func(3,5);
        
        System.out.println("max lambda = " + max );
		
		

	}

}

@FunctionalInterface
interface Func {
	int func(int x, int y);
}
