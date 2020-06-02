package exam01;

public class NullPointerExceptionExam {
	public static void main(String[] args) {
		String str = null;
		
		try {
			System.out.println(str.toString());	
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
