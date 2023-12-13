package ObjectTest;

public class Key {
	int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key k = (Key)obj;
			if(this.number == k.number)
				return true;
		}
		return false;
	}
	
	public int hashCode() {
		return number;
	}//이거 추가해줘야 키값 비교로 바뀜.
	
}
