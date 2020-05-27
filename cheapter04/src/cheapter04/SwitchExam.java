package cheapter04;
public class SwitchExam {
	public static void main(String[] args) {
		int number = (int) (Math.random() * 6) + 1;
		switch (number) {
			case 1:
				System.out.println("1번입니다.");
				break;
			case 2:
				System.out.println("2번입니다.");
				break;
			case 3:
				System.out.println("3번입니다.");
				break;
			case 4:
				System.out.println("4번입니다.");
				break;
			case 5:
				System.out.println("5번입니다.");
				break;
			case 6:
				System.out.println("6번입니다.");
				break;
			default:
				break;
		}
	}
}
