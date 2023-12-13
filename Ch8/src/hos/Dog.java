package hos;

public class Dog implements Pet{
	private double runSpeed;
	private String ownerName;
	
	public Dog(String ownerName, double speed)
	{
		this.ownerName = ownerName;
		this.runSpeed = speed;
	}
	
	public String OwnerName(){
		return ownerName;
	}
	
	public double RunSpeed()
	{
		return runSpeed;
	}
	
	public void Cry()
	{
		System.out.println("Meong Meong");
	}
}
