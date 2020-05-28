package cheapter05;

import java.util.Scanner;

public class ArrCreateByNewExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[10];
		double sum = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "번째 학생 점수 > ");
			scores[i] = sc.nextInt();
		}
		for (int i = 0; i < 10; i++)
			sum += scores[i];

		System.out.println("총합 : " + sum + "점");
		System.out.println("평균 : " + sum / scores.length + "점");
		
		
	}
}
