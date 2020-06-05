package exam02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("0");
		set.add("ㄱ");

		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next().hashCode());
		}

		System.out.println();
		for (String string : set) {
			System.out.println(string);
		}
	}
}
