package exam03;

public class PersonExam {
	public static void main(String[] args) {
		Person p1 = new Person("123456-789123","계백");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation ="usa"
//		p1.ssn = "1234-5678";
		p1.name ="트럼프";
	}
	
}
