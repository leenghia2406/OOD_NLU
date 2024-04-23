package decorator;

public class ThietKeCanhQuan extends Decorator{

	public ThietKeCanhQuan() {
		super();
		// TODO Auto-generated constructor stub
		donGia = 1000.0;
	}

	public ThietKeCanhQuan(String maXD, XayNha xayNha) {
		super(maXD, xayNha);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double chiPhi() {
		// TODO Auto-generated method stub
		return donGia;
	}

	@Override
	public String thongTin() {
		// TODO Auto-generated method stub
		return "Thiet ke canh quan";
	}
	
}
