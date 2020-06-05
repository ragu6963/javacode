package exam02;

import java.util.*;

public class HashSetMemberExam {
	public static void main(String[] args) {
		Member m1 = new Member("name1", 20);
		Member m2 = new Member("name1", 20);
		Member m3 = new Member("name1", 7);
		Member m4 = new Member("name2", 29);

		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
		System.out.println(m4.hashCode());

		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		System.out.println(m1.equals(m4));

		Set<Member> set = new HashSet<>();
		set.add(m1);
		set.add(m2);
		set.add(m3);
		set.add(m4);

		for (Member member : set) {
			System.out.println(member.toString());
		}
	}
}