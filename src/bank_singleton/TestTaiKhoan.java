package bank_singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;

public class TestTaiKhoan {
	public static void main(String[] args) {
		Function<String, TaiKhoan> function = (name) -> TaiKhoan.getInstance();
		Runnable runable1 = () -> function.apply("Tao tai khoan ngan hang" ).giaoDichNopTienVaoTK(3000);
		Runnable runable2 = () -> function.apply("Tao tai khoan ngan hang" ).giaoDichNopTienVaoTK(5000);
		Runnable runable3 = () -> function.apply("Tao tai khoan ngan hang" ).giaoDichRutTien(10000);
		Runnable runable4 = () -> function.apply("Tao tai khoan ngan hang" ).giaoDichRutTien(5000);
		Runnable runable5 = () -> function.apply("Tao tai khoan ngan hang" ).giaoDichRutTien(1000);
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		executorService.execute(runable1);
		executorService.execute(runable2);
		executorService.execute(runable3);
		executorService.execute(runable4);
		executorService.execute(runable5);
	}
}
