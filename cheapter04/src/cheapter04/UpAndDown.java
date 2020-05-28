package cheapter04;

import java.util.Scanner;

public class UpAndDown {
	public static int StringInput() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		while (!CheckIntString(str)) {
			System.out.println("숫자가 아닙니다. 다시입력하세요.");
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
		System.out.println("숫자 맞추기 UP & DOWN!!");
		Scanner sc = new Scanner(System.in);

		int com = (int) (Math.random() * 50) + 1;

		System.out.println(com);
		System.out.println("1 부터 50 사이의 숫자를 맞춰보세요 (1 ~ 50)");
		int player = 0;
		String str = "";

		int max = 50;
		int min = 1;
		int cnt = 0;

		do {
			player = StringInput();
			cnt++;

			while (player > max || player < min) {
				System.out.println("범위를 벗어났습니다. 다시 입력하세요.");
				System.out.println("(" + min + " ~ " + max + ")");

				player = StringInput();
			}
			if (player > com) {
				max = player - 1;
				System.out.print("입력한 숫자가 더 큽니다.");
				System.out.println("더 작은 숫자를 입력하세요. DOWN!!");
				System.out.println("(" + min + " ~ " + max + ")");
			} else if (player < com) {
				min = player + 1;
				System.out.print("입력한 숫자가 더 작습니다.");
				System.out.println("더 큰 숫자를 입력하세요. UP!!");
				System.out.println("(" + min + " ~ " + max + ")");
			}
		} while (com != player);

		System.out.println("정답! 축하드립니다.");
		System.out.println(cnt + "번만에 맞추셨습니다.");
	}
}