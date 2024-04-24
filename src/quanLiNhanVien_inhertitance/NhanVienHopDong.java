package quanLiNhanVien_inhertitance;

import java.util.Date;

public class NhanVienHopDong extends NhanVien {
	public NhanVienHopDong(String maNV, String tenNV, boolean nu, Date ngaySinh, float luongCB, Date ngayVaoLam,
			Phong phong) {
		super(maNV, tenNV, nu, ngaySinh, luongCB, ngayVaoLam, phong);
		// TODO Auto-generated constructor stub
	}
	@Override
	public float tinhThuong(int soThang) {
		// TODO Auto-generated method stub
		int nam = soThang / 12;
		return nam > 0 ? nam * luongCB: 0; 
	}
	@Override
	public float tinhLuong(int soThang) {
		// TODO Auto-generated method stub
		return soThang * luongCB;
	}
	
}
