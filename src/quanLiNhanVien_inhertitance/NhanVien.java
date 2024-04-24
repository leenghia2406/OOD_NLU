package quanLiNhanVien_inhertitance;
import java.util.*;

public abstract class NhanVien {
    protected String maNV;
    protected String tenNV;
    protected boolean nu;
    protected Date ngaySinh;
    protected float luongCB;
    protected Date ngayVaoLam;
    protected Phong phong;
	public NhanVien(String maNV, String tenNV, boolean nu, Date ngaySinh, float luongCB, Date ngayVaoLam, Phong phong) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.nu = nu;
		this.ngaySinh = ngaySinh;
		this.luongCB = luongCB;
		this.ngayVaoLam = ngayVaoLam;
		this.phong = phong;
	}
	
    @Override
	public String toString() {
		return "Ma NV: " + maNV + ", Ten NV: " + tenNV + ", Gioi nu: " + nu + ", Ngay Sinh: " + ngaySinh.getDate() + " " + ngaySinh.getMonth()+ " " + ngaySinh.getYear() + ", LuongCB: "
				+ luongCB + ", NgayVaoLam: " + ngayVaoLam.getDate() + " " + ngayVaoLam.getMonth() + " "+ ngayVaoLam.getYear() +", "+  phong;
	}

	public abstract float tinhThuong(int soThang);
    public abstract float tinhLuong(int soThang);
}
