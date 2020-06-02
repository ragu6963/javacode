package exam09;

public class Car {
	private int speed;
	private boolean stop;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed >= 0 && speed <= 350) {
			this.speed = speed;
			System.out.println("현재 속도 : " + this.speed);
		} else {
			System.out.println("오류");
		}
	}

	public boolean isStop() {
		return stop;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", stop=" + stop + "]";
	}

	public void setStop(boolean stop) {
		this.stop = true;
		this.speed = 0;
	}

}