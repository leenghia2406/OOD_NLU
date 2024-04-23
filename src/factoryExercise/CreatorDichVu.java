package factoryExercise;

public interface CreatorDichVu {
	public ProductDichVu taoDV(String loai);
	public ProductDichVu themDV(ProductDichVu dichvu);
}
