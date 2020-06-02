package exam02;

public class ThrowExam {
	public void method1() {
		try {
			method2();
		} catch (Exception e) {
			System.out.println("클래스 없음");
		} finally {
			System.out.println("FINNALLY BLOCK");
		}
	}

	public void method2() throws Exception {
		String str = null;
		str.toString();
	}
}