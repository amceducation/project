public class Mobile {
	public void m1() {
		System.out.println("Hi There");
	}
	public void m1(int a) {
		System.out.println(a);
	}
	public void m1(double a) {
		System.out.println(a);
	}
	public String m1(String message) {
		return message;
	}
	public void m1(int x,String y) {
		System.out.println(x + y);
	}
	public void m1(String a,int b) {
		System.out.println(a + b);
	}
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.m1();
		mobile.m1(100);
		mobile.m1(95.00);
		System.out.println("Dhee Codimg Lab");
		mobile.m1(9 , "Lakshmi");
		mobile.m1("Deepika",1);
	}
}

    

