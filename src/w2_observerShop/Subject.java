package w2_observerShop;

public interface Subject {
	public void registerObserverKM(ObserverKM o);
	public void removeObserverKM(ObserverKM o);
	public void notifySubscribersKM(String tenCongTy, String noidungchuongtrinh);
	public void registerObserverSPM(ObserverSPM o);
	public void removeObserverSPM(ObserverSPM o);
	public void notifySubscribersSPM(String tenCongTy, String noidungchuongtrinh);
}
