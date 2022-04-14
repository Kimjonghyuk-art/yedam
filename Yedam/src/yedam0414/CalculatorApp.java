package yedam0414;

import java.util.Scanner;

class Calculator {

	final private double pi = 3.14;

	void getArea(double radius) {
		double area = pi * radius * radius;
		System.out.println("반지름" + radius + "의 넓이는" + area);
	}

	void printPi() {
		System.out.println("원주율은" + pi);
	}

	int sum(int x, int y) {
		return x + y;
	}

	double getTriangleArea(int width, int length) {

		return (width * length) / 2;
	}

	void sum(int[] arr, int ran) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran;
			System.out.println(arr[i]);
		}
	}
}

public class CalculatorApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Calculator cal = new Calculator();
		// System.out.print("반지름 입력 > ");
		// double radius = sc.nextDouble();

		// cal.printPi();

		// cal.getArea(radius);

		// System.out.println(cal.sum(10, 20));

		System.out.println(cal.getTriangleArea(10, 10));

		System.out.print("숫자>>");
		int selectNum = sc.nextInt();

		int arr[] = new int[selectNum];
		int ran;
		for (int i = 0; i < arr.length; i++) {
			ran = (int) (Math.random() * 10) + 1;
			arr[i] = ran;
			cal.sum(arr, ran);
		}

	}

}
