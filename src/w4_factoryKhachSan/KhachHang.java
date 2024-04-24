package w4_factoryKhachSan;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Set;

public class KhachHang {
	private String name;
	private String cmnd;
	private String quoctich;
	private double tiendatCoc;
	private ProductPhong phong;
	private Date ngayDen;
	private Date ngayDi;
	private Set<DichVuProduct> list;

	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KhachHang(String name, String cmnd, String quoctich, double tiendatCoc, ProductPhong phong, Date ngayDen,
			Date ngayDi) {
		super();
		this.name = name;
		this.cmnd = cmnd;
		this.quoctich = quoctich;
		this.tiendatCoc = tiendatCoc;
		this.phong = phong;
		this.ngayDen = ngayDen;
		this.ngayDi = ngayDi;

	}

	public KhachHang(String name, String cmnd, String quoctich, double tiendatCoc, ProductPhong phong, Date ngayDen,
			Date ngayDi, Set<DichVuProduct> list) {
		this.name = name;
		this.cmnd = cmnd;
		this.quoctich = quoctich;
		this.tiendatCoc = tiendatCoc;
		this.phong = phong;
		this.ngayDen = ngayDen;
		this.ngayDi = ngayDi;
		this.list = list;
	}

	public Set<DichVuProduct> getList() {
		return list;
	}

	public void setList(Set<DichVuProduct> list) {
		this.list = list;
	}

	public int songayO() {
		LocalDate start = LocalDate.of(ngayDen.getNam(), ngayDen.getThang(), ngayDen.getNgay());
		LocalDate end = LocalDate.of(ngayDi.getNam(), ngayDi.getThang(), ngayDi.getNgay());
		int songay = (int) ChronoUnit.DAYS.between(start, end);
		return songay;
	}
	public double thienThuePhong() {
		return phong.donGia * songayO() - tiendatCoc;
	}

	public double thanhTien() {
		double total = 0;
		if (list == null) {
			total=0;
		} else {
			for (DichVuProduct dichVuProduct : list) {
				if (dichVuProduct instanceof DVKara) {
					DVKara ka = (DVKara) dichVuProduct;
					total += ka.tinhTien();
				} else if (dichVuProduct instanceof DVTamHoi) {
					DVTamHoi tam = (DVTamHoi) dichVuProduct;
					total += tam.tinhTien();
				} else if (dichVuProduct instanceof DVAnUong) {
					DVAnUong an = (DVAnUong) dichVuProduct;
					total += an.tinhTien();
				} else if (dichVuProduct instanceof DVThueXe) {
					DVThueXe xe = (DVThueXe) dichVuProduct;
					total +=xe.tinhTien();
				}else if (dichVuProduct instanceof DVGYM) {
					DVGYM xe = (DVGYM) dichVuProduct;
					total +=xe.tinhTien();
				}
			}
		}
		
		return total +thienThuePhong();
	}

	@Override
	public String toString() {
		if (list == null) {
			return name + "\t" + cmnd + "\t" + quoctich + "\t" + tiendatCoc + "\t" + phong.thongTinTaoPhong() + "\t"
					+ ngayDen.toString() + "\t" + ngayDi.toString() + "\n\tSo Ngay Thue: " + songayO()
					+ "\tThanh Tien: " + thanhTien();
		} else {
			return name + "\t" + cmnd + "\t" + quoctich + "\t" + tiendatCoc + "\t" + phong.thongTinTaoPhong() + "\t"
					+ ngayDen.toString() + "\t" + ngayDi.toString() + "\n\tSo Ngay Thue: " + songayO()
					+ "\tThanh Tien: " + thanhTien() 
					+ "\nDich vu su dung " + list.toString();

		}

	}

	public String dichvuSD() {
		String st = "";
		for (DichVuProduct dichVuProduct : list) {
			if (dichVuProduct instanceof DVKara) {
				DVKara ka = (DVKara) dichVuProduct;
				st += ka.tenDV + "\t\t\t" + DVKara.getSoGio() + "\t\t" + ka.doGia + "\t\t"+0.0+"\t"+ka.tinhTien()+"\n";
			} else if (dichVuProduct instanceof DVTamHoi) {
				DVTamHoi tam = (DVTamHoi) dichVuProduct;
				st += tam.tenDV + "\t\t\t" + DVTamHoi.getSolan() + "\t\t" + tam.doGia + "\t\t"+0.0+"\t"+tam.tinhTien()+"\n";
			} else if (dichVuProduct instanceof DVAnUong) {
				DVAnUong an = (DVAnUong) dichVuProduct;
				st += an.tenDV + "\t\t\t" + DVAnUong.getSolan() + "\t\t" + an.doGia + "\t\t"+0.0+"\t"+an.tinhTien()+"\n";
			} else if (dichVuProduct instanceof DVThueXe) {
				DVThueXe xe = (DVThueXe) dichVuProduct;
				st += xe.tenDV + "\t\t\t" + DVThueXe.getSongayThue() + "\t\t" + xe.doGia + "\t\t"+0.0+"\t"+xe.tinhTien()+"\n";
			}else if (dichVuProduct instanceof DVGYM) {
				DVGYM gym = (DVGYM) dichVuProduct;
				st += gym.tenDV + "\t\t\t" + DVGYM.getSoGio() + "\t\t" + gym.doGia + "\t\t"+0.0+"\t"+gym.tinhTien()+"\n";
			}

		}

		return st;
	}

	public void hoaDon() {
		
		System.out.println("Ma KH:" + cmnd + "\t" + "Ten Khach Hang: " + name);
		System.out.println("Loai Phong :" + phong.tenPhong);
		System.out.println("Cac khoan su dung" + "\t\t" + "So lan" + "\t\t" 
		+ "Don Gia"+ "\t\t" + "TienDatCoc"+"\t"+"ThanhTien");
		if (list == null) {
			System.out.println(phong.tenPhong+"\t\t\t"+songayO()+"\t\t"+phong.donGia+"\t\t"+tiendatCoc+"\t"+thienThuePhong());
		} else {
			System.out.println(phong.tenPhong+"\t\t\t"+songayO()+"\t\t"+phong.donGia+"\t\t"+tiendatCoc+"\t"+thienThuePhong());
			System.out.println(dichvuSD());
		}
		
		System.out.println("Tong thanh tien : " + thanhTien() + " VND");
		System.out.println();
	}

	public int demSoDVSD(Date start, Date end) {
		int solan = 0;
		if(checkHopLe(start,end)==true) {
			if (list == null) {
				solan=0;
			} else {
				
				for (DichVuProduct dichVuProduct : list) {
					if (dichVuProduct instanceof DVKara) {
						solan +=  DVKara.getSoGio();
					} else if (dichVuProduct instanceof DVTamHoi) {
						
						solan +=  DVTamHoi.solan;
					} else if (dichVuProduct instanceof DVAnUong) {
						
						solan += DVAnUong.solan;
					} else if (dichVuProduct instanceof DVThueXe) {
						
						solan +=DVThueXe.getSongayThue();
					}else if (dichVuProduct instanceof DVGYM) {
					
						solan +=DVGYM.getSoGio();
					}
				}
			}
		}
		
		
		return solan;
	}
	public boolean checkHopLe(Date start, Date end) {
		LocalDate startA = LocalDate.of(start.getNam(), start.getThang(), start.getNgay());
		LocalDate startB = LocalDate.of(end.getNam(), end.getThang(), end.getNgay());
		LocalDate me = LocalDate.of(ngayDen.getNam(), ngayDen.getThang(), ngayDen.getNgay());
		return me.isAfter(startA) && me.isBefore(startB);
	}
}
