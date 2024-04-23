package finalTest2023;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Item> list = new ArrayList<>();

	public ShoppingCart(List<Item> list) {
		super();
		this.list = list;
	}

	public ShoppingCart() {
		super();
	}

	public List<Item> getList() {
		return list;
	}

	public void setList(List<Item> list) {
		this.list = list;
	}
	public void addItem(Item item) {
		list.add(item);
	}
	public void removeItem(Item item) {
		list.remove(item);
	}
	public double getTotalPrice() {
		double totalPrice = 0.0;
		for (Item item : list) {
			totalPrice += item.getTotalPrice();
		}
		return totalPrice;
	}
	
	
}
