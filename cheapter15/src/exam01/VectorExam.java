package exam01;

import java.util.*;

public class VectorExam {
	public static void main(String[] args) {
		List<String> vec = new Vector<String>();

		vec.add("a");
		vec.add("b");
		vec.add("c");
		vec.add(2, "e");
		for (String string : vec) {
			System.out.println(string);
		}
		System.out.println();

		vec.remove(0);
		vec.remove("b");

		for (String string : vec) {
			System.out.println(string);
		}
		System.out.println();
	}
}
