package Animal;

public class Store {
	Item item;
	
	void SetItem(Item item) {
		this.item = item;
	}
	
	void CheckPrice() {
		item.GetPrice();
	}
}
