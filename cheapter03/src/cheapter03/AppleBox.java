package cheapter03;

import java.util.Scanner;

public class AppleBox {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("총 사과의 개수를 적어주세요.");
		int apple = scan.nextInt();
		System.out.println("박스 당 들어가는 사과의 개수를 적어주세요.");
		int box = scan.nextInt();
		System.out.println("사과 박스 = " + (int) (apple / box));
		System.out.println("남는 사과 = " + apple % box);
	}
}
