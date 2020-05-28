package cheapter04;

import java.io.IOException;
import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) throws IOException {
		boolean run = true;
		double balance = 0;
		int keyCode = 0;
		int money = 0;
		double ratio = 0;
		Scanner sc = new Scanner(System.in);
		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("---------------------------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("---------------------------------");
				System.out.println("선택");
			}
			keyCode = System.in.read();
			if (keyCode == 49) {
				System.out.print("예금액> ");
				money = sc.nextInt();
				balance += money;
			} else if (keyCode == 50) {
				System.out.print("출금액> ");
				money = sc.nextInt();
				balance -= money;
			} else if (keyCode == 51) {
				if (balance >= 0) {
					System.out.println("통장 잔고> " + (int) balance);
				} else {
					System.out.println("마이너스 통장 잔고> " + (int) balance);
				}
				continue;
			} else if (keyCode == 52) {
				break;
			} else if (keyCode == 13 || keyCode == 10) {
				continue;
			} else {
				System.out.println("1 ~ 4를 입력해주세요");
				continue;
			}
			ratio = Math.random();
			System.out.println("이자율> " + Math.round(ratio * 100) / 100.0);
			balance += ratio * balance;
		}
		System.out.println("프로그램 종료");
	}

}
