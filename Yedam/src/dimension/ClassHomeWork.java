package dimension;

	class TV {
	
	 String brand;
	 int year;
	 int inch;
	
	public TV() {
	}
	
	public TV(String brand, int year, int inch) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	public void show() {
		System.out.println(brand + "에서 만든" + year + "년 형" + inch+ "인치 TV");
		
	}
	
}


public class ClassHomeWork {

	public static void main(String[] args) {
	
		TV myTV = new TV("LG", 2017, 32);

		myTV.show();
	}

}
