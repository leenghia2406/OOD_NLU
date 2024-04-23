package ex2_observer;

public class Logger implements Observer{

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		System.out.println("Logger: "+ user);
	}
	
}
