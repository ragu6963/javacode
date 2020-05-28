package cheapter05;

public class EachForExam {
	public static void main(String[] args) {
		int[] scores = { 1, 2, 3, 4, 5 };
		double sum = 0;
		for (int i : scores)
			sum += i;
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum / scores.length);

		int[][] sc = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 } };

		for (int[] is : sc) {
			for (int is2 : is) {
				System.out.println(is2);
			}
		}
	}
}