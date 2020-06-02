package exam02;	
		

public class VehicleExam {
	public static void main(String[] args) {
		Vehicle v = new Bus();
		Vehicle c = new Car();
		if(v instanceof Bus) {
			System.out.println("this bus");
		}
		if(v instanceof Car) {
			System.out.println("this Car");
		}
	}
	
	
}
