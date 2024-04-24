package w1_strategyCuaHang;

import java.util.List;

public class KhachHangThanhToanTienMatHDTrenMotTrieu extends KhachHang{
	
	public KhachHangThanhToanTienMatHDTrenMotTrieu() {
		super();
		// TODO Auto-generated constructor stub
		hinhThucThanhToan = new TienMat();
		hinhThucTichDiem= new TrenMotTrieu();
		//sum=thanhTien()>1000000?thanhTien():0;
	}
	

	public KhachHangThanhToanTienMatHDTrenMotTrieu(String maKH, String tenKH, Date ngaySinh, int diemThuong,
			List<SanPham> listHH) {
		super(maKH, tenKH, ngaySinh, diemThuong, listHH);
		// TODO Auto-generated constructor stub
		hinhThucThanhToan = new TienMat();
		hinhThucTichDiem= new TrenMotTrieu();
		//sum=thanhTien()>10000?thanhTien():0;
	}


	@Override
	public double thanhTien() {
		// TODO Auto-generated method stub
		 
				double sum =0.0;
				for (int i = 0; i < listHH.size(); i++) {
					if(listHH.get(i) instanceof HangDienMay) {
						sum+=listHH.get(i).getGia();
					}else if(listHH.get(i) instanceof ThucPham) {
						sum+=listHH.get(i).getGia();
					}else {
						sum+=listHH.get(i).getGia();
					}
				}
				return sum - ((hinhThucThanhToan.giamThanhToan() * sum) + hinhThucTichDiem.diemThuong() * 5000);
	
	}



}
