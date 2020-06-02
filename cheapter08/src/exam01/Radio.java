package exam01;

public class Radio implements RemoteControl {
	int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("라디오 ON");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("라디오 OFF");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setMust(boolean mute) {
		// TODO Auto-generated method stub
		RemoteControl.super.setMust(mute);
		System.out.println("radio mute");
	}
}
