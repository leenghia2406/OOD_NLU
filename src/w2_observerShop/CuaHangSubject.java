package w2_observerShop;

import java.util.ArrayList;
import java.util.List;

public class CuaHangSubject implements Subject{
	private String tenCH;
	private String newsKM;
	private String newsSPM;
	private List<ObserverKM> listKM;
	private List<ObserverSPM> listSPM;
	
	public CuaHangSubject() {
		super();
		// TODO Auto-generated constructor stub
		listKM= new ArrayList<>();
		listSPM= new ArrayList<>();
	}
	
	public CuaHangSubject(String tenCH) {
		super();
		this.tenCH = tenCH;
		listKM= new ArrayList<>();
		listSPM= new ArrayList<>();
	}

	public CuaHangSubject(String tenCH, String newsKM, String newsSPM) {
		super();
		this.tenCH = tenCH;
		this.newsKM = newsKM;
		this.newsSPM = newsSPM;
		listKM= new ArrayList<>();
		listSPM= new ArrayList<>();
	}

	public String getTenCH() {
		return tenCH;
	}

	public void setTenCH(String tenCH) {
		this.tenCH = tenCH;
	}

	public String getNewsKM() {
		return newsKM;
	}

	public void setNewsKM(String newsKM) {
		System.out.printf("\nName: %sTin : %s\n", tenCH, newsKM);
		notifySubscribersKM(tenCH,newsKM);
	}

	public String getNewsSPM() {
		return newsSPM;
	}

	public void setNewsSPM(String newsSPM) {
		System.out.printf("\nName: %s, Tin  : %s\n", tenCH, newsSPM);
		notifySubscribersSPM(tenCH,newsSPM);
	}


	@Override
	public void notifySubscribersKM(String tenCongTy, String noidungchuongtrinh) {
		// TODO Auto-generated method stub
		for (ObserverKM observerKM : listKM) {
			observerKM.upatedKM(tenCongTy, noidungchuongtrinh);
		}
	}
	
	@Override
	public void notifySubscribersSPM(String tenCongTy, String noidungchuongtrinh) {
		// TODO Auto-generated method stub
		for (ObserverSPM observerKM : listSPM) {
			observerKM.updateSPM(tenCongTy, noidungchuongtrinh);
		}
		
		
	}

	@Override
	public synchronized void registerObserverKM(ObserverKM o) {
		// TODO Auto-generated method stub
		listKM.add(o);
	}

	@Override
	public synchronized void removeObserverKM(ObserverKM o) {
		// TODO Auto-generated method stub
		listKM.remove(o);
	}

	@Override
	public synchronized void registerObserverSPM(ObserverSPM o) {
		// TODO Auto-generated method stub
		listSPM.add(o);
		
	}

	@Override
	public synchronized void removeObserverSPM(ObserverSPM o) {
		// TODO Auto-generated method stub
		listSPM.remove(o);
	}

}
