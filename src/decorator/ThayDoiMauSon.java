package decorator;

public class ThayDoiMauSon extends Decorator{
	
	

	public ThayDoiMauSon() {
		super();
		// TODO Auto-generated constructor stub
		donGia = 500.0;
	}

	public ThayDoiMauSon(String maXD, XayNha xayNha) {
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
		return "Thay doi mau son";
	}
	
}
