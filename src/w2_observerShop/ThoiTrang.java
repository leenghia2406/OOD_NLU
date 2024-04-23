package w2_observerShop;

public class ThoiTrang extends SanPham{
	private int thoigianBH;

	public ThoiTrang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ThoiTrang(String maSP, String tenSP, double donGia, String noiSX) {
		super(maSP, tenSP, donGia, noiSX);
		// TODO Auto-generated constructor stub
	}

	public ThoiTrang(String maSP, String tenSP, double donGia, String noiSX,int thoigianBH) {
		super(maSP, tenSP, donGia, noiSX);
		this.thoigianBH = thoigianBH;
	}
 
}
