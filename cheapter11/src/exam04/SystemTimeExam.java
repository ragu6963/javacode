package exam04;

public class SystemTimeExam {
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		long sum = 0;
		for(int i = 1 ; i<=1000000000;i++) {
			sum +=i;
		}
		long time2 = System.nanoTime();
		
		System.out.println("합 = " +sum);
		System.out.println("소모시간 = " + (time2-time1));
	}
}
