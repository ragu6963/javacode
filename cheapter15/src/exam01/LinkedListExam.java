package exam01;

import java.util.*;

public class LinkedListExam {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();

		long startT, endT;

		startT = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endT = System.nanoTime();
		System.out.println("소모 시간 : " + (endT - startT));

		startT = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endT = System.nanoTime();
		System.out.println("소모 시간 : " + (endT - startT));
	}
}
