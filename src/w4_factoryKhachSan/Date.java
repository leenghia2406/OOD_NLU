package w4_factoryKhachSan;

import java.time.LocalDate;

public class Date {
	private int ngay,thang,nam;

	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date(int ngay, int thang, int nam) {
		super();
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

	public int getNgay() {
		return ngay;
	}

	public int getThang() {
		return thang;
	}

	public int getNam() {
		return nam;
	}

	@Override
	public String toString() {
		return ngay + "/" + thang + "/" + nam;
	}
	
	

}
