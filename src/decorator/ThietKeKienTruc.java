package decorator;

public class ThietKeKienTruc extends XayNha{
	
	public ThietKeKienTruc() {
		super();
		// TODO Auto-generated constructor stub
		donGia = 2000.0;
	}

	public ThietKeKienTruc(String maLoai) {
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
		return "Thiet ke kien truc";
	}
	
}
