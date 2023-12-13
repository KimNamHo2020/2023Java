package innerinterface;

public class Message {

}package Innerinterface;

public class Message implements Button.OnClickListener {
	public void onClick() {
		System.out.println("Send Message");
	}
}
