package Animal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital h = new Hospital();
		Dog d = new Dog();
		
		h.SetPatient(d);
		h.CheckSound();
		
		Store s = new Store();
		s.SetItem(d);
		s.CheckPrice();
	}

}
