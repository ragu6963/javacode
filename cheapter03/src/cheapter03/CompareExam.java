package cheapter03;

public class CompareExam {
	public static void main(String[] args) {
		System.out.println(1 == 1);

		System.out.println(65 == 'A');

		System.out.println('A' < 'B');
		System.out.println(3.0 == 3.0f);

		String str1 = "대구";
		String str2 = "대구";
		String str3 = new String("대구");
		String str4 = new String("대구");
		String str5 = str3.toString();
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		System.out.println(str3 == str5);
		System.out.println(str1.equals(str3));
		System.out.println(str3.equals(str4));
	}
}