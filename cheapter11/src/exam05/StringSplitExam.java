package exam05;

public class StringSplitExam {
	public static void main(String[] args) {
		String[] result = "홍길동&이수홍,박연수,김자바-최명호".split("&|,|-");

		for (String string : result) {
			System.out.println(string);
		}
	}
}
