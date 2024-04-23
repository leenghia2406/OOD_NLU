package ex2_observer;

import java.util.ArrayList;
import java.util.List;

public class AccountService implements Subject{
	private User user;
	private List<Observer> observers = new ArrayList<>();
	
	public AccountService(String email, String ip) {
		super();
		user = new User();
		user.setEmail(email);
		user.setIp(ip);
	}

	@Override
	public void attach(Observer observer) {
		// TODO Auto-generated method stub
		if (!observers.contains(observer)) {
			observers.add(observer);
		}
	}

	@Override
	public void dettach(Observer observer) {
		// TODO Auto-generated method stub
		if (observers.contains(observer)) {
			observers.remove(observer);
		}
	}

	@Override
	public void notifyAllObserver() {
		// TODO Auto-generated method stub
		for (Observer observer : observers) {
			observer.update(user);
		}
	}
	public void changeStatus(LoginStatus status) {
		user.setStatus(status);
		System.out.println("Status is changed");
		notifyAllObserver();
	}
	public void login() {
		if (!this.isValidIP()) {
			user.setStatus(LoginStatus.INVALID);
		} else if (this.isValidEmail()) {
			user.setStatus(LoginStatus.SUCCESS);
		}else {
			user.setStatus(LoginStatus.FAILURED);
		}
		System.out.println("Login is handle");
		notifyAllObserver();
	}
	private boolean isValidIP() {
		return "127.0.0.1".equals(user.getIp());
	}
	private boolean isValidEmail() {
		return "cuto@gmail.com".equalsIgnoreCase(user.getEmail());
	}
}
