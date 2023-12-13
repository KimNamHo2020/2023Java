package Animal;

public class Hospital {
//	Patient p = new Dog();
	Patient p;
	
	void SetPatient(Patient p) {
		this.p = p;
	}
	
	void CheckSound() {
		p.Sound();
	}
}
