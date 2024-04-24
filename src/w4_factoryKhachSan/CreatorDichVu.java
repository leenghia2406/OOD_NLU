package w4_factoryKhachSan;

public interface CreatorDichVu {
	//tao dich vu moi
	public DichVuProduct taoDichVu(String loaiDV);
	//them dich vu da ton tai
	public DichVuProduct ThemDV(DichVuProduct dv);
}
