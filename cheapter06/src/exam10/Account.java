package exam10;

public class Account {

	private String ano;
	private String owner;
	private int balance;
	private static int number;

	public Account(String ano, String owner, int balance) {
		super();
		number++;
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public static int getNumber() {
		return number;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
	}

	public void setBalance(int x) {
		this.balance += balance;
		
	}

}
