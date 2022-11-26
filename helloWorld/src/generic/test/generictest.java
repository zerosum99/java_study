package generic.test;

public class generictest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Generic Test ");
		
		Gen<Integer> a = new Gen<>();
		a.setUnit(Integer.valueOf(100));
		
		System.out.println("set value = " + a.unit);
		System.out.println("get value = " + a.getUnit());
		
		
		Gen<Super> as = new Gen<>();
		as.setUnit(new Sub());
		
		System.out.println("set value = " + as.unit);
		System.out.println("get value = " + as.getUnit());
		
		

	}

}
