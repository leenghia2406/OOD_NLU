package w1_strategyCuaHang;

import java.util.List;

public class KhachHangThanhToanChuyenKhoanHDDuoiMotTrieu extends KhachHang {
	
	
	public KhachHangThanhToanChuyenKhoanHDDuoiMotTrieu() {
		super();
		// TODO Auto-generated constructor stub
		hinhThucThanhToan = new ChuyenKhoan();
		hinhThucTichDiem= new DuoiMotTrieu();
		//sum = thanhTien()<1000000?thanhTien():0;
		
	}



	public KhachHangThanhToanChuyenKhoanHDDuoiMotTrieu(String maKH, String tenKH, Date ngaySinh, int diemThuong,
			List<SanPham> listHH) {
		super(maKH, tenKH, ngaySinh, diemThuong, listHH);
		// TODO Auto-generated constructor stub
		hinhThucThanhToan = new ChuyenKhoan();
		hinhThucTichDiem= new DuoiMotTrieu();
		//sum = thanhTien()<1000000?thanhTien():0;
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
			}else if(listHH.get(i) instanceof GiaDung){
				sum+=listHH.get(i).getGia();
			}
		}
		return sum - ((hinhThucThanhToan.giamThanhToan() * sum) + hinhThucTichDiem.diemThuong() * 2000);
	}

}
