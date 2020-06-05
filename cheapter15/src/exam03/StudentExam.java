package exam03;

import java.util.HashMap;
import java.util.Map;

public class StudentExam {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student(1, "홍길동"), 10);
		map.put(new Student(1, "홍길동"), 10);

		System.out.println(map.size());

	}
}
