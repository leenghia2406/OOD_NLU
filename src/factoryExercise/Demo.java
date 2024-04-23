package factoryExercise;

import java.util.List;

public class Demo {
	private KhachSan ks;
	private List<KhachHang> listKH;
	public Demo(KhachSan ks, List<KhachHang> listKH) {
		super();
		this.ks = ks;
		this.listKH = listKH;
	}
	public Demo() {
		super();
	}
	public void addKH(KhachHang kh) {
		listKH.add(kh);
	}
	public void inTatCaHoaDon() {
		
	}
	public static void main(String[] args) {
		
	}
}
