package practice2;

public class Sword extends Weapon {
	public void swing() {
		System.out.println("swish");
	}
	
	public void attack() {
		swing();
	}
}
