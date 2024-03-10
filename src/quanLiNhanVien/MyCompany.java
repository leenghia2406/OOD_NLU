package quanLiNhanVien;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MyCompany {
	private Map<String, Phong> dsPhong;
    private Map<String, NhanVien> dsNhanVien;

    public MyCompany() {
        this.dsPhong = new HashMap<>();
        this.dsNhanVien = new HashMap<>();
    }
    
    public Map<String, Phong> getDsPhong() {
		return dsPhong;
	}

	public void setDsPhong(Map<String, Phong> dsPhong) {
		this.dsPhong = dsPhong;
	}

	public Map<String, NhanVien> getDsNhanVien() {
		return dsNhanVien;
	}

	public void setDsNhanVien(Map<String, NhanVien> dsNhanVien) {
		this.dsNhanVien = dsNhanVien;
	}

	public void themPhong(Phong phong) {
        dsPhong.put(phong.maPB, phong);
    }

    public void themNhanVien(NhanVien nhanVien) {
        dsNhanVien.put(nhanVien.maNV, nhanVien);
        Phong phong = nhanVien.phong;
        if (phong != null) {
            phong.themNhanVien(nhanVien);
        }
    }

    public static void main(String[] args) {
        MyCompany company = new MyCompany();

        Phong phong1 = new Phong("PB01", "Phòng Kĩ Thuật");
        Phong phong2 = new Phong("PB02", "Phòng Kế Toán");
        
        NhanVien nv1 = new NhanVienHopDong("NV01", "Le Trong Nghia", false, new Date(2004, 6, 24), 3900, new Date(2024, 6, 24), phong1);
        NhanVien nv2 = new NhanVienHopDong("NV02", "Lionel Messi", false, new Date(1989, 6, 24), 3000, new Date(2021, 6, 24), phong1);
        NhanVien nv3 = new NhanVienCoHuu("NV03", "Cristiano Ronaldo", false, new Date(1987, 1, 1), 2500, new Date(2008, 1, 10), phong1, 2.0f, 200);
        NhanVien nv4 = new NhanVienCoHuu("NV04", "David De Gea", false, new Date(1990, 1, 1), 2400, new Date(2018, 1, 10), phong2, 2.0f, 200);
        NhanVien nv5 = new NhanVienCoHuu("NV05", "Harry Kane", false, new Date(1992, 1, 21), 2400, new Date(2019, 1, 15), phong2, 2.0f, 200);
        NhanVien nv6 = new NhanVienCoHuu("NV06", "Harry Potter", false, new Date(1990, 1, 1), 2400, new Date(2022, 1, 10), phong2, 2.0f, 200);
        
        company.themPhong(phong1);
        company.themPhong(phong2);
        company.themNhanVien(nv1);
        company.themNhanVien(nv2);
        company.themNhanVien(nv3);
        company.themNhanVien(nv4);
        company.themNhanVien(nv5);
        company.themNhanVien(nv6);
        
        int soThangTinhLuong = 24;
        phong1.inBangLuong(soThangTinhLuong);
        phong2.inBangLuong(soThangTinhLuong);
        System.out.println(nv1);
        System.out.println(nv2);
        System.out.println(nv3);
        System.out.println(nv4);
        System.out.println(nv5);
        System.out.println(nv6);
    }
    
}
