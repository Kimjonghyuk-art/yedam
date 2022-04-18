package yedam0418.poly;

public class AnimalEx {

	public static void main(String[] args) {
		
		
		Animal animal = null;
		
		animal = new Bird();
		
		animal.eat();
		animal.move();
		animal.sleep();
		
		Dog dog = new Dog();
		
		dog.eat();
		dog.move();
		dog.sleep();
	}

}
