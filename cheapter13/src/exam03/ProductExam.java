package exam03;

public class ProductExam {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();

		Tv tv = new Tv();
		product1.setKind(tv);
		String str = "삼성";
		product1.setModel(str);

		System.out.println(product1.getModel());
	}

	public static class Tv {
	}
}