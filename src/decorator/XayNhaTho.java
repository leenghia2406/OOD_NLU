package decorator;

public class XayNhaTho extends XayNha{
	
	public XayNhaTho() {
		super();
		// TODO Auto-generated constructor stub
		donGia = 40000.0;
	}

	public XayNhaTho(String maLoai) {
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
		return "Xay nha tho";
	}
	
}
