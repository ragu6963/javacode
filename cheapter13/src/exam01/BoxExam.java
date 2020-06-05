package exam01;

public class BoxExam {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("hello");
		String str = box.get().toString();
		System.out.println(str);

		Apple apple = new Apple();
		box.set(apple);
		Apple a = (Apple) box.get();
		System.out.println(apple);
		System.out.println(a);
	}
}
