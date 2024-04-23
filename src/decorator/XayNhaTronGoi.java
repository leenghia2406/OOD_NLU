package decorator;

public class XayNhaTronGoi extends XayNha{
	
	public XayNhaTronGoi() {
		super();
		// TODO Auto-generated constructor stub
		donGia = 60000.0;
	}

	public XayNhaTronGoi(String maLoai) {
		super(maLoai);
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
		return "Xay nha tron goi";
	}
	
}
