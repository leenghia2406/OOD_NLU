package w4_factoryKhachSan;

public class FactoryTiVi implements ConreteProductTiVi{
	protected String id;
	protected String ten;
	public FactoryTiVi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FactoryTiVi(String maDienThoai, String loai) {
		super();
		this.id = maDienThoai;
		this.ten = loai;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setten(String ten) {
		this.ten = ten;
	}
	@Override
	public String information() {
		// TODO Auto-generated method stub
		return id +"\t"+ ten;
	}
	

}
