package finalTest2023;

public class Test {
	public static void main(String[] args) {
		Product pro1 = new Product("Nuoc loc", 5000.0);
		Product pro2 = new Product("Nuoc ngot Cocacola", 15000.0);
		Product pro3 = new Product("Nuoc ngo Pepsi", 15000.0);
		Item item1 = new Item(pro1, 3);
		Item item2 = new Item(pro2, 2);
		Item item3 = new Item(pro3, 1);
		
	}
}
