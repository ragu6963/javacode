package exam01;

public class Television implements RemoteControl , Searchable{

	int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV ON!");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV OFF!");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if (this.volume + volume > MAX_VOLUME)
			this.volume = MAX_VOLUME;
		else if (this.volume + volume < MIN_VOLUME)
			this.volume = MIN_VOLUME;

		System.out.println("현재 VOLUME : " + this.volume);
	}

	@Override
	public void setMust(boolean mute) {
		// TODO Auto-generated method stub
		RemoteControl.super.setMust(mute);

	}

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + " 검색");
	}

}
