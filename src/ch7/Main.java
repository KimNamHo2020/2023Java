package ch7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HankookTire hTire = new HankookTire();
//		Car sc = new Car(hTire);
//		sc.run();
//		KumhoTire kTire = new KumhoTire();
//		sc.SetTire(kTire);
//		sc.run();
		//여기까지가 다형성 모를 때 쓰는 방법. 하위 타이어가 많아질수록 코드가 지저분해진다
		
		Tire tire = new HankookTire();
		NewCar sc = new NewCar(tire);
		sc.run();
		tire = new KumhoTire();
		sc.SetTire(tire);
		sc.run();
		} 
	//Car 와 NewCar 코드를 비교해보면 NewCar가 얼마나 간결한지 알 수 있다.

	}