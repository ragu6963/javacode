package exam09;

public class CarExam {
	public static void main(String[] args) {
		Car car = new Car();

		System.out.println(car.getSpeed());

		if (!car.isStop())
			car.setStop(true);
		
		car.setSpeed(60);
		
		System.out.println(car.getSpeed());
	}
}
