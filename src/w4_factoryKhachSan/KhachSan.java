package w4_factoryKhachSan;

public abstract class KhachSan {
	protected abstract ProductPhong taoPhong(String loaiPhong);
	protected abstract DichVuProduct taoDichVu(String loaiDV);
	protected abstract DichVuProduct ThemDV(DichVuProduct dv);
	
}
