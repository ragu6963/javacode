package cheapter05;

public class ArrCreateByValueListExam {
	public static void main(String[] args) {
		int[] scores = { 80, 90, 87 };
		System.out.println("scores[0] = " + scores[0]);
		System.out.println("scores[1] = " + scores[1]);
		System.out.println("scores[2] = " + scores[2]);
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i] );
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}
}