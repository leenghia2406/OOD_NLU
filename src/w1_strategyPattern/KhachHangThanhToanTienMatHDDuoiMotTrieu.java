package w1_strategyPattern;

import java.util.List;

public class KhachHangThanhToanTienMatHDDuoiMotTrieu extends KhachHang{
	
	public KhachHangThanhToanTienMatHDDuoiMotTrieu() {
		super();
		// TODO Auto-generated constructor stub
		hinhThucThanhToan = new TienMat();
		hinhThucTichDiem= new DuoiMotTrieu();
		//sum=thanhTien()<1000000?thanhTien():0;
	}

	public KhachHangThanhToanTienMatHDDuoiMotTrieu(String maKH, String tenKH, Date ngaySinh, int diemThuong,
			List<SanPham> listHH) {
		super(maKH, tenKH, ngaySinh, diemThuong, listHH);
		// TODO Auto-generated constructor stub
		hinhThucThanhToan = new TienMat();
		hinhThucTichDiem= new DuoiMotTrieu();
		//sum=thanhTien()<1000000?thanhTien():0;
	}

	@Override
	public double thanhTien() {
		// TODO Auto-generated method stub
		double sum=0;
		for (int i = 0; i < listHH.size(); i++) {
			if(listHH.get(i) instanceof HangDienMay) {
				sum+=listHH.get(i).getGia();
			}else if(listHH.get(i) instanceof ThucPham) {
				sum+=listHH.get(i).getGia();
			}else {
				sum+=listHH.get(i).getGia();
			}
		}
		
		return sum*(1-super.thucHienHinhThucThanhToan())-super.thucHienTichDiem();

	}
	

}
