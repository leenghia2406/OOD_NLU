package w4_factoryKhachSan;

public class FactoryDienThoai implements ConreteProductDienThoai{
	protected String maDienThoai;
	protected String loai;
	public FactoryDienThoai() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FactoryDienThoai(String maDienThoai, String loai) {
		super();
		this.maDienThoai = maDienThoai;
		this.loai = loai;
	}
	
	public String getMaDienThoai() {
		return maDienThoai;
	}
	public void setMaDienThoai(String maDienThoai) {
		this.maDienThoai = maDienThoai;
	}
	public String getLoai() {
		return loai;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}
	@Override
	public String information() {
		// TODO Auto-generated method stub
		return maDienThoai+"\t"+loai;
	}
	

}
