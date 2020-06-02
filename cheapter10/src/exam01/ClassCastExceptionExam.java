package exam01;

public class ClassCastExceptionExam {
	public static void main(String[] args) {

		try {
			int i = 39 / 0;
			System.out.println(i);
			Dog dog = new Dog();
			changeDog(dog);

			Cat cat = new Cat();
			changeDog(cat);
		}
		catch (ClassCastException e) {
			System.out.println("class cast Exception");
		}
		catch (Exception e) {
			System.out.println("에러발생");
			System.out.println(e);
		} finally {

		}
	}

	public static void changeDog(Animal animal) {
			Dog dog = (Dog) animal;
	}
}

class Animal {
}

class Cat extends Animal {
}

class Dog extends Animal {
}