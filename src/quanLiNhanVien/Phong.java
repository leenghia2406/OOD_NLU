package quanLiNhanVien;

import java.util.ArrayList;
import java.util.List;

public class Phong {
    String maPB;
    private String tenPB;
    private List<NhanVien> dsNhanVien;
	public Phong(String maPB, String tenPB) {
        this.maPB = maPB;
        this.tenPB = tenPB;
        this.dsNhanVien = new ArrayList<>();
	}
    public void themNhanVien(NhanVien nhanVien) {
        dsNhanVien.add(nhanVien);
    }

    public float tinhTongLuong(int soThang) {
        float tongLuong = 0;
        for (NhanVien nhanVien : dsNhanVien) {
            tongLuong += nhanVien.tinhLuong(soThang);
        }
        return tongLuong;
    }
    
    @Override
	public String toString() {
		return "Ten Phong: " + tenPB;
	}
	public void inBangLuong(int soThang) {
        System.out.println("Bảng lương phòng: " + tenPB);
        for (NhanVien nhanVien : dsNhanVien) {
            System.out.println("Nhân viên: " + nhanVien.tenNV + ", Lương: " + nhanVien.tinhLuong(soThang));
        }
        System.out.println("Tổng lương phòng: " + tinhTongLuong(soThang));
    }
}
