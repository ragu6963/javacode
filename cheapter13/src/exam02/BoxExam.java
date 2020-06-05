package exam02;

public class BoxExam {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.set("aa");
		String str = box.get();

		System.out.println(str);

		Box<Integer> box2 = new Box<>();
		box2.set(1);
		int a = box2.get();
		System.out.println(a);
	}
}
