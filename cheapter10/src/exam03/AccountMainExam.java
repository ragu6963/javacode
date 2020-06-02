package exam03;

public class AccountMainExam {
	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(1000);
		try {
			account.withdraw(2000);
		} catch (BalanceInsufficientException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
