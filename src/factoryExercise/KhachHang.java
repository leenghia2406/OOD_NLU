package factoryExercise;

import java.util.List;

public class KhachHang {
	private String macccd;
	private String ten;
	private String quocTich;
	private Date ngayDen;
	private Date ngayDi;
	private double tienDatCoc;
	private ProductPhong phong;
	private List<ProductDichVu> listDV;
	
	public KhachHang() {
		super();
	}

	public KhachHang(String macccd, String ten, String quocTich, Date ngayDen, Date ngayDi, double tienDatCoc,
			ProductPhong phong, List<ProductDichVu> listDV) {
		super();
		this.macccd = macccd;
		this.ten = ten;
		this.quocTich = quocTich;
		this.ngayDen = ngayDen;
		this.ngayDi = ngayDi;
		this.tienDatCoc = tienDatCoc;
		this.phong = phong;
		this.listDV = listDV;
	}

	public KhachHang(String macccd, String ten, String quocTich, Date ngayDen, Date ngayDi, double tienDatCoc,
			ProductPhong phong) {
		super();
		this.macccd = macccd;
		this.ten = ten;
		this.quocTich = quocTich;
		this.ngayDen = ngayDen;
		this.ngayDi = ngayDi;
		this.tienDatCoc = tienDatCoc;
		this.phong = phong;
	}

	public List<ProductDichVu> getListDV() {
		return listDV;
	}

	public void setListDV(List<ProductDichVu> listDV) {
		this.listDV = listDV;
	}
	public int soNgayO() {
		return Integer.parseInt(ngayDen.toString()) - Integer.parseInt(ngayDi.toString());
	}

	
	
}
