package factoryExercise;

public class TVSamSung extends Tivi{
	static int count;
	public TVSamSung() {
		super();
		// TODO Auto-generated constructor stub
		maTV = "SA"+ (++count);
		tenTV = "Sam Sung";
	}
	public TVSamSung(String maTV, String tenTV) {
		super(maTV, tenTV);
		// TODO Auto-generated constructor stub
	}
	
	
}
