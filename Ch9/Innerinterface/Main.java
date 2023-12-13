package Innerinterface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button b = new Button();
		
		Call c = new Call();
//		b.SetOnClickListener(c);
		b.SetOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Make a call");
			}
		});//익명객체 정의하는 방식으로도 가능
		b.touch();
		
		Message m = new Message();
		b.SetOnClickListener(m);
		b.touch();
		b.touch();
		
		b.SetOnClickListener(c);
		b.touch();
	}

}
