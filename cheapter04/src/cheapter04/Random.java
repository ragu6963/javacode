package cheapter04;

import java.util.Scanner;

public class Random {
	public static void main(String[] args) {
		System.out.println("주사위 숫자 맞추기!");

		Scanner sc = new Scanner(System.in);
		int cnt = 0;

		for(int i = 1 ; i<=5;i++) {

			int pc = (int) (Math.random() * 6) + 1;

			System.out.println("1~6 숫자를 하나 입력해주세요.");
			int player = sc.nextInt();

			if (player <= 6 && player >= 1) {
				System.out.println("컴퓨터 숫자 : " + pc);

				if (pc == player) {
					System.out.println("정답!");
					cnt++;
				} else {
					System.out.println("오답!");
				}
			} 		
			else {
				System.out.println("1~6 숫자를 입력하세요. 다음기회에!");
			}
		}

		System.out.println(cnt + "번 맞았습니다.");

	}
}
