package exam01;

import java.util.*;

public class ArrayListExam {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("JAVA");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");

		for (String string : list) {
			System.out.println(string);
		}
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		list.remove(0);
		list.remove("JDBC");
		for (String string : list) {
			System.out.println(string);
		}
	}
}
