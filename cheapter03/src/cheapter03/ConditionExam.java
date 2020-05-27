package cheapter03;

import java.util.Scanner;

public class ConditionExam {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		
		int score = sc.nextInt();
		
		String grade = score >= 80 ? "합격" : "불합격";

		System.out.println(grade);
	}
}
