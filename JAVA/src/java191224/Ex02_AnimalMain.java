package java191224;

public class Ex02_AnimalMain {

	public static void main(String[] args) {
		
		// Animal ani = new Animal();
		
		Ex02_Dog dog = new Ex02_Dog();
		dog.sound();
		dog.breath();
		
		Ex02_Cat cat = new Ex02_Cat();
		cat.sound();
		cat.breath();
		
		// 다형성(polymorphism)
		Ex02_Animal ani = new Ex02_Dog();
		ani.sound();
		ani = new Ex02_Cat();
		ani.sound();
		
		// 자식클래스 끼리는 안됨
		// cat = new Ex02_Dog();
		
	}

}
