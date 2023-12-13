package hos;

public class Cat implements Pet{
	private double jumpingHeight;
	private String ownerName; 
	
	public Cat(String ownerName, double height) {
		this.ownerName = ownerName;
		this.jumpingHeight = height;
	}
	
	public String OwnerName(){
		return ownerName;
	}
	
	public double JumpingHeight()
	{
		return jumpingHeight;
	}
	
	public void Cry()
	{
		System.out.println("Meow Meow");
	}
}
