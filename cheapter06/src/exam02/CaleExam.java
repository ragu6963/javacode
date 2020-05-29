package exam02;

public class CaleExam {
	public static void main(String[] args) {
		Cale cale = new Cale();
		System.out.println(cale.add(1, 2));
		System.out.println(cale.add(1.5, 2));
		System.out.println(cale.add("1.5", "2.5"));
	}
}