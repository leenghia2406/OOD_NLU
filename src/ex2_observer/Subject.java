package ex2_observer;

public interface Subject {
	public void attach(Observer observer);
	public void dettach(Observer observer);
	public void notifyAllObserver();
}
