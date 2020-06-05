package exam05;

import java.util.StringTokenizer;

public class StringTokenizerExam {
	public static void main(String[] args) {

		String s = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(s, "/");

		int count = st.countTokens();

		for (int i = 0; i < count; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}

		st = new StringTokenizer(s, "/");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
