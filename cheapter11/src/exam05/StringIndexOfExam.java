package exam05;

public class StringIndexOfExam {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		int index = subject.indexOf("프로그래밍");

		System.out.println(index);

		String newsubject = subject.replace("자바", "JAVA");
		System.out.println(newsubject);
	}
}
