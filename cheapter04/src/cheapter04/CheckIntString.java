package cheapter04;

import java.util.Scanner;

public class CheckIntString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("확인할 문자열을 입력하세요.");
		String str = sc.nextLine();

		boolean flag = true;
		
		for (int i = 0 ; i < str.length(); i++) {
			char temp = str.charAt(i);
			if (!Character.isDigit(temp)) {
				flag = false;
				System.out.println("문자 입니다.");
				break;
			}
		}

		if (flag)
			System.out.println("숫자 입니다.");
	}
}