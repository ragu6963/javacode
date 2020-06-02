package exam03;

public class AnonymouseExam {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		anony.field.wake();
		anony.method();
		anony.method2(new Person() {
			void study() {
				System.out.println("공부");
			}
			@Override
			void wake() {
				super.wake();
				study();
			}
			
		});
	}
}