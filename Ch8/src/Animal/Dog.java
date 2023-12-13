package Animal;

public class Dog implements Patient, Item{
	public void Sound() {
		System.out.println("Mong Mong");
	}
	
	public void GetPrice() {
		System.out.println("Price is 10,000 won");
	}
}
