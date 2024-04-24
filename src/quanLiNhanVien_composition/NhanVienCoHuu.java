package quanLiNhanVien_composition;

public class NhanVienCoHuu implements LoaiNV {
	private double hsLuong;
	private double tienBaoHiem;
	@Override
	public double tinhThuong(NhanVien nv, int soThang) {
		// TODO Auto-generated method stub
		int nam = soThang / 12;
		return nam > 0 ? nam * nv.getLuongCB() * hsLuong: 0;  
	}

	@Override
	public double tinhLuong(NhanVien nv, int soThang) {
		// TODO Auto-generated method stub
		return soThang * (nv.getLuongCB() * hsLuong - tienBaoHiem);
	}
	
}
