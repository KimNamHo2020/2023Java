package ObjectTest;

public class MyClass {
	public String toString() {
		return "HI";
	} 
	
	public int id;
	
	public MyClass(int id) {
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof MyClass) {
			MyClass myclass = (MyClass) obj;
			if(myclass.id == id) {
				return true;
			}
		}
		return false;
	}
}
