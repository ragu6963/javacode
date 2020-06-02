package exam10;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArr = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true;

		while (run) {
			System.out.println("-----------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 ");
			System.out.println("-----------------------------");
			System.out.println("선택> ");

			int selectNo = sc.nextInt();
			sc.nextLine();
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}

		}

	}

	private static void createAccount() {
		System.out.println("생성할 계좌 번호를 입력해주세요.");
		System.out.print("입력> ");
		String ano = sc.nextLine();
		Account account = findAccount(ano);
		if (account == null) {
			// 계좌가 없을 때
			System.out.println("사용자 이름을 입력해주세요.");
			System.out.print("입력> ");
			String name = sc.nextLine();
			accountArr[Account.getNumber()] = new Account(ano, name, 0);
		} else {
			// 계좌가 있을 때
			System.err.println("동일한 계좌번호가 있습니다.");
		}
	}

	private static void accountList() {
		if (Account.getNumber() == 0) {
			System.out.println("생성된 계좌가 없습니다.");
		} else {
			for (int i = 0; i < Account.getNumber(); i++) {
				System.out.println(accountArr[i].toString());
			}
		}
	}

	private static void deposit() {
		System.out.println("계좌 번호를 입력해주세요.");
		System.out.print("입력> ");
		String ano = sc.nextLine();
		Account account = findAccount(ano);
		if (account != null) {
			System.out.println("입금할 금액을 입력해주세요.");
			System.out.print("입력> ");
			int money = sc.nextInt();
			account.setBalance(money);
		} else {
			System.out.println("계좌목록에 없습니다.");
		}
	}

	private static void withdraw() {
		System.out.println("계좌 번호를 입력해주세요.");
		System.out.print("입력> ");
		String ano = sc.nextLine();
		Account account = findAccount(ano);
		if (account != null) {
			System.out.println("출금할 금액을 입력해주세요.");
			System.out.print("입력> ");
			int money = sc.nextInt();
			account.setBalance(money);
		} else {
			System.out.println("계좌목록에 없습니다.");
		}
	}

	private static Account findAccount(String ano) {
		for (int i = 0; i < Account.getNumber(); i++) {
			if (ano.equals(accountArr[i].getAno())) {
				return accountArr[i];
			}
		}
		return null;
	}
}
