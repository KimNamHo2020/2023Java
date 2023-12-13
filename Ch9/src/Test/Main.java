package Test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A a = new A();
//		A.B b = a.new B(); 
//		A.memberA = 20; 
		//a.memberA = 20;
		//System.out.println(a.memberA);
		
		//A.B b = new A.B(); 
		
		//A.C c = a.new C();
		
		Outter o = new Outter();
		Outter.Nested n = o.new Nested();
		n.method();
		n.method2();
		
	}

}
