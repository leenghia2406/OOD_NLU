package quanLiNhanVien_composition;

public class NhanVien {
    protected String maNV;
    protected String tenNV;
    protected boolean nu;
    protected Date ngaySinh;
    protected float luongCB;
    protected Date ngayVaoLam;
    protected Phong phong;
    protected LoaiNV loaiNv;
	public NhanVien(String maNV, String tenNV, boolean nu, Date ngaySinh, float luongCB, Date ngayVaoLam, Phong phong,
			LoaiNV loaiNv) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.nu = nu;
		this.ngaySinh = ngaySinh;
		this.luongCB = luongCB;
		this.ngayVaoLam = ngayVaoLam;
		this.phong = phong;
		this.loaiNv = loaiNv;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public boolean isNu() {
		return nu;
	}
	public void setNu(boolean nu) {
		this.nu = nu;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public float getLuongCB() {
		return luongCB;
	}
	public void setLuongCB(float luongCB) {
		this.luongCB = luongCB;
	}
	public Date getNgayVaoLam() {
		return ngayVaoLam;
	}
	public void setNgayVaoLam(Date ngayVaoLam) {
		this.ngayVaoLam = ngayVaoLam;
	}
	public Phong getPhong() {
		return phong;
	}
	public void setPhong(Phong phong) {
		this.phong = phong;
	}
	public LoaiNV getLoaiNv() {
		return loaiNv;
	}
	public void setLoaiNv(LoaiNV loaiNv) {
		this.loaiNv = loaiNv;
	}
    public double tinhLuong(int soThang) {
    	return loaiNv.tinhLuong(this, soThang);
    }
    public double tinhThuong(int soThang) {
    	return loaiNv.tinhThuong(this, soThang);
    }
    
}
