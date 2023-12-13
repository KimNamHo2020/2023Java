package Test;

public class A {
	int memberA = 10;
	
	int field1 = 10;
	static int field2 = 20;
	B b = new B();
	C c = new C();
//	static C c1 = new C(); 
	static B b1 = new B();
	
	void method1() {
		B b = new B();
		C c = new C();
	}
	static void method2() {}
	
	A(){
		System.out.println("A instance is generated.");
	}
	
	static class B {
		void method() {
//			field1 = 30;
//			method1(); 
			field2 = 40;
			method2();
		}
		
//		B(){
//			System.out.println("B instance is generated.");
//		}
//		int field1 = 10;
//		static int field2 = 20;
//		
//		void method1() {}
//		static void method2() {}
	}
	
	class C {
		void method() {
			field1 = 30;
			method1();
			field2 = 40;
			method2();
			
		}
		
		
	}
	
	
	
//	void method1() {
//		class D {
//			D () {
//				System.out.println("D instance is generated.");
//			}
//		}
//		D d = new D();
//	}
//	
//	void method2() {
////		 D d = new D(); 
//	}
}


