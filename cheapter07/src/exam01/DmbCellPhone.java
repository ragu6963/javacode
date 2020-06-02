package exam01;

public class DmbCellPhone extends CellPhone {
	int channel;
	public DmbCellPhone() {
		// TODO Auto-generated constructor stub
	}
	public DmbCellPhone(int channel) {
		super("samsung", "red");
		System.out.println("DmbCellPhone " + channel + " 생성");

	}

	@Override
	void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("Dmb 전원 ON");
	}

}
