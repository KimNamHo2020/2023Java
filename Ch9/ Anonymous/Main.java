package Anonymous;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent() {
			public void method() {
				System.out.println("I am a new child");
			}
		}; 
		
		p.method();
		
		Main m = new Main();
		
//		m.TestMethod(new Child()); 
		m.TestMethod(new Parent() {
			void method() {
				System.out.println("I am a child");
			}
		});
		
		RemoteControl r = new RemoteControl() {
			public void TurnOn() {
				System.out.println("전원이 켜졌습니다");
			}
		};
		r.TurnOn();
		
	}	
		
		void TestMethod(Parent p) {
			p.method();
		}
		
	

}
