package Test;

public class Outter {
	int field = 10;
	
	void method() {
		System.out.println("Outter class method");
	}
	
	class Nested{
		int field = 20;
		void method() {
			System.out.println("Nested class method : " + field); // Outter 의 field와 Nested의 필드 사용. 둘 다 정의시 하이딩이 되므로 Nested의 field 사용하게 됨. 이 때 Outter.this.field를 쓰면 Outter의 field 사용
		}
		
		void method2() {
			method(); 
	}
	
	
	}
}
