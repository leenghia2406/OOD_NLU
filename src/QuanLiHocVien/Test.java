package QuanLiHocVien;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Teacher teach1 = new Teacher("Lionel Messi", "1/1/1989", "Professor");
		Subject sub = new Subject("111", 3, teach1);
		List<Subject> lisSub1 = new ArrayList<>();
		lisSub1.add(sub);
		Student std1 = new Student("Le Trong Nghia", "24/06/2004", teach1, lisSub1);
		System.out.println(std1.toString());
	}

	
}
