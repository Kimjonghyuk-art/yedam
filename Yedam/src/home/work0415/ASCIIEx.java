package home.work0415;

import java.util.Random;
import java.util.Scanner;

public class ASCIIEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println((char)((int)(Math.random()*26)+65));

		System.out.println((char)((int)(Math.random()*26)+97));
		
		
		Random random = new Random();
        int length = random.nextInt(5)+5;
 
        StringBuffer newWord = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int choice = random.nextInt(3);
            switch(choice) {
                case 0:
                    newWord.append((char)((int)random.nextInt(25)+97));
                    break;
                case 1:
                    newWord.append((char)((int)random.nextInt(25)+65));
                    break;
                case 2:
                    newWord.append((char)((int)random.nextInt(10)+48));
                    break;
                default:
                    break;
            }
        }
        System.out.println("newWord = (" + newWord + "), length = " + length);

		System.out.print("비교 입력 >");
		
		String str = sc.next();
		
		String newword = newWord.toString();
		
		if(str.equals(newword)) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
			System.out.println(newWord);
			System.out.println(str);
		}
		
		
	}

}
