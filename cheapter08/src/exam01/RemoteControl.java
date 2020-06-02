package exam01;

public interface RemoteControl {
	public int MAX_VOLUME = 100;
	public int MIN_VOLUME = 0;

	public void turnOn();

	public void turnOff();

	public void setVolume(int volume);

	default void setMust(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	static void changeBattery() {
		System.out.println("건전지 교환");
	}
}
