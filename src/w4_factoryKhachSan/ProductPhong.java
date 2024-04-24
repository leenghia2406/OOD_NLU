package w4_factoryKhachSan;

public abstract class ProductPhong {
	protected String tenPhong;
	protected FactoryDienThoai dienThoai;
	protected FactoryTiVi tiVi;
	protected FactoryTuLanh tuLanh;
	protected double donGia;
	protected int soNguoiMax;
	protected abstract void taoVLXDPhong();
	
	public String getTenPhong() {
		return tenPhong;
	}
	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}
	
	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public String thongTinTaoPhong() {
		return tenPhong+"\t" + dienThoai.information()+"\t"+tiVi.information()+"\t"+tuLanh.information();
	}
	

}
