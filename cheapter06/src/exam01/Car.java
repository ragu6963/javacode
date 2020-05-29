package exam01;

public class Car {
	String Model;
	String Color;
	String Company;
	int Price;
	int Speed;
	int MyNumber;
	static int Number;

	public Car() {

	}

	Car(String model, String color, String company, int price, int speed) {
		this(model, color, company, price, speed, 1);
	}

	Car(String model, String color, String company, int price, int speed, int myNumber) {
		Model = model;
		Color = color;
		Company = company;
		Price = price;
		Speed = speed;
		MyNumber = myNumber;
	}

	@Override
	public String toString() {
		return "Car [Model=" + Model + ", Color=" + Color + ", Company=" + Company + ", Price=" + Price + ", Speed="
				+ Speed + "]";
	}

	void SpeedUp(int input) {
		Speed += input;
	}

	void SpeedUp() {
		Speed++;
	}

	void SpeedDown(int input) {
		Speed -= input;
	}

	int sum(int... values) {
		int result = 0;
		for (int i = 0; i < values.length; i++) {
			result += values[i];
		}
		return result;
	}

	int sum(char op, int... values) {
		int res = 0;
		if (op == '+') {
			for (int i : values) {
				res += i;
			}
		} else if (op == '*') {
			res = 1;
			for (int i : values) {
				res *= i;
			}
		}
		SpeedUp();
		return res;
	}
}

class Tire {

}