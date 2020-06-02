package exam05;

public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
	}

	@Override
	public void bellOn() {
		System.out.println("RRRR~~");

	}
}
