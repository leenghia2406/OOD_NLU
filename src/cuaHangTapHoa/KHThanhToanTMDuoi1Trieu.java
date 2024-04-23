package cuaHangTapHoa;

import java.util.List;

public class KHThanhToanTMDuoi1Trieu extends KhachHang {
	
	public KHThanhToanTMDuoi1Trieu(String maKH, String tenKH, int diemTichLuy, Date ngaySinh, List<SanPham> dsSanPham) {
		super(maKH, tenKH, diemTichLuy, ngaySinh, dsSanPham);
		// TODO Auto-generated constructor stub
		htDiemThuong = new DonHangDuoi1Trieu();
		htThanhToan = new TienMat();
	}

	@Override
	public double thanhTien() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		double sum = 0;
		for (int i = 0; i < dsSanPham.size(); i++) {
			if (dsSanPham.get(i) instanceof DienLanh) {
				sum += dsSanPham.get(i).getGia();
			}else if(dsSanPham.get(i) instanceof ThucPham) {
				sum += dsSanPham.get(i).getGia();
			}else if(dsSanPham.get(i) instanceof GiaDung) {
				sum += dsSanPham.get(i).getGia();
			}
		}
		return sum - super.thucHienHTThanhToan() * sum - super.thucHienHTDiemThuong() * 5000;
	}
	
	
	
}
