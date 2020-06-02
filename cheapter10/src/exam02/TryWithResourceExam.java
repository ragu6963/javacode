package exam02;

public class TryWithResourceExam {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception();

		} catch (Exception e) {
			System.out.println("예외처리");
		}
	}
}