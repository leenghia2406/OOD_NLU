package starbuzz;

public class Beverage {
	private String description;
	private double cost;
	private String size;
    public Beverage(String description) {
        this.description = description;
        this.cost = 0.0;
        this.size = "small"; // Mặc định là size nhỏ
    }
    public void setSize(String size) {
        this.size = size.toLowerCase();
    }
    public String getSize() {
        return size;
    }
    public void addCondiment(String condiment) {
        // Thêm phụ gia và tính giá theo kích thước
        if (condiment.equals("soy")) {
            if (size.equals("small")) {
                cost += 0.10;
            } else if (size.equals("medium")) {
                cost += 0.15;
            } else if (size.equals("large")) {
                cost += 0.20;
            }
            // Các phụ gia khác có thể được thêm ở đây
        }
        // Logic cho các phụ gia khác
    }

    public double getCost() {
        // Trả về tổng chi phí của đồ uống
        return cost;
    }

    public String getDescription() {
        // Trả về mô tả của đồ uống
        return description;
    }
}
