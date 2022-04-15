package yedam0415;

public class SingletonExample {

	public static void main(String[] args) {
	
		
		Singleton s1 = Singleton.getInstance();
		
		Singleton s2 = Singleton.getInstance();
		
		
		if(s1 == s2) {
			System.out.println("same");
		} else {
			System.out.println("diffe");
		}
		
	}

}
