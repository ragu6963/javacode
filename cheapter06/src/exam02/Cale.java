package exam02;

public class Cale {
	double res;

	int add(int a, int b) {
		return a + b;
	}

	double add(double a, double b) {
		return a + b;
	}

	double add(String a, String b) {
		return Double.parseDouble(a) + Double.parseDouble(b);
	}

}