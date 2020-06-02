package exam02;

public class SportCar extends Car {
	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		speed += 10;
	}

	@Override
	public void stop() {
		System.err.println("스포츠카 멈춤");
		speed = 0;

	}
}
