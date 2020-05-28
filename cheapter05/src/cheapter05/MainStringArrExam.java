package cheapter05;

import java.util.Iterator;
import java.util.Scanner;

public class MainStringArrExam {

	public static int Input() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		while (!CheckIntString(str)) {
			System.out.println("양수가 아닙니다. 다시입력하세요.");
			str = sc.nextLine();
		}
		return Integer.parseInt(str);
	}

	public static boolean CheckIntString(String str) {

		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			if (!Character.isDigit(temp)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		int[][] scores = new int[10][3];
		int key = 0;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("==================================");
			System.out.println("메뉴");
			System.out.println("1. 학생 점수 입력 | 2. 성적처리결과 | 3. 부분 학생 점수 수정 | 4. 종료");
			System.out.println("==================================");
			System.out.print("선택> ");
			key = Input();

			if (key == 1) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print(i + 1 + "번 학생 영어 점수> ");
					scores[i][0] = Input();
					System.out.print(i + 1 + "번 학생 수학 점수> ");
					scores[i][1] = Input();
					System.out.print(i + 1 + "번 학생 언어 점수> ");
					scores[i][2] = Input();
					System.out.println("--------------------------------");
				}
				flag = true;
			}

			else if (key == 2) {
				if (flag == false) {
					System.out.println("우선 점수를 입력해 주세요.");
					continue;
				}
				double eng = 0;
				double math = 0;
				double kor = 0;
				for (int i = 0; i < scores.length; i++) {
					double sum = 0;
					sum += scores[i][0] + scores[i][1] + scores[i][2];
					eng += scores[i][0];
					math += scores[i][1];
					kor += scores[i][2];
					System.out.println(i + 1 + "번 학생 총점> " + sum);
					System.out.println(i + 1 + "번 학생 평균> " + sum / 3);
					System.out.println("--------------------------------");
				}
				System.out.println("영어 전체 총점 : " + eng + " / 평균 : " + eng / 10);
				System.out.println("수학 전체 총점 : " + math + " / 평균 : " + math / 10);
				System.out.println("언어 전체 총점 : " + kor + " / 평균 : " + kor / 10);
				System.out.println("--------------------------------");

			}

			else if (key == 3) {

				if (flag == false) {
					System.out.println("우선 점수를 입력해 주세요.");
					continue;
				}

				System.out.println("원하는 학생의 번호를 선택하세요.");
				System.out.print("선택> ");

				int index = Input();

				while (index < 1 || index > 10) {
					System.out.println("1번부터 10번까지 선택해주세요.");
					System.out.print("선택> ");
					index = Input();
				}

				System.out.print(index + "번 학생 영어 점수> ");
				scores[index - 1][0] = Input();
				System.out.print(index + "번 학생 수학 점수> ");
				scores[index - 1][1] = Input();
				System.out.print(index + "번 학생 언어 점수> ");
				scores[index - 1][2] = Input();
				System.out.println("--------------------------------");

			} else if (key == 4) {
				break;
			} else {
				System.out.println("1 ~ 4를 입력해주세요.");
			}
		}
		System.out.println("프로그램 종료");
	}
}
