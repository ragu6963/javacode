package exam04;

import java.util.Comparator;

public class ClassMate implements Comparable<ClassMate> {
	int ssn;
	String name;

	public ClassMate(int ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ClassMate [ssn=" + ssn + ", name=" + name + "]";
	}

	@Override
	public int compareTo(ClassMate o) {
		return this.name.compareTo(o.name);
//		return this.ssn - o.ssn;
	}

	public static Comparator<ClassMate> comparator_name = new Comparator<ClassMate>() {

		@Override
		public int compare(ClassMate o1, ClassMate o2) {
			return o1.name.compareTo(o2.name);
		}

	};

	public static Comparator<ClassMate> com_name = new Comparator<ClassMate>() {

		@Override
		public int compare(ClassMate o1, ClassMate o2) {
			// TODO Auto-generated method stub
			return o1.name.compareTo(o2.name) * -1;
		}
	};
}