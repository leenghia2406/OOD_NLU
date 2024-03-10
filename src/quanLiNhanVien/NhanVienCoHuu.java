package quanLiNhanVien;

import java.util.Date;

public class NhanVienCoHuu extends NhanVien{
	private float hsLuong;
	private float tienBaoHiem;
	
	public NhanVienCoHuu(String maNV, String tenNV, boolean nu, Date ngaySinh, float luongCB, Date ngayVaoLam,
			Phong phong, float hsLuong, float tienBaoHiem) {
		super(maNV, tenNV, nu, ngaySinh, luongCB, ngayVaoLam, phong);
		this.hsLuong = hsLuong;
		this.tienBaoHiem = tienBaoHiem;
	}
	@Override
	public float tinhThuong(int soThang) {
		// TODO Auto-generated method stub
		int nam = soThang / 12;
		return nam > 0 ? nam * luongCB * hsLuong: 0;  
	}
	@Override
	public float tinhLuong(int soThang) {
		// TODO Auto-generated method stub
		return soThang * (luongCB * hsLuong - tienBaoHiem);
	}
	
}
