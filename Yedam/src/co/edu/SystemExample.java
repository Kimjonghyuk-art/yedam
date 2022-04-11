package co.edu;

import java.io.IOException;
import java.util.Scanner;

public class SystemExample {
	public static void main(String[] args) {
		//표준 입출력
		Scanner scn = new Scanner(System.in);
		
		//System.out.println("세 개의 단어를 입력 : ");
		/*
		 * while(scn.hasNext()) { String str = scn.next(); System.out.print(str);
		 * 
		 * if(str.equals("exit")) { break; } }
		 */
		
		
		//System.out.println("end of program");
		
		
		
		System.out.println("숫자를 입력하세요.");
			while(true) {
				int readByte;
				try {
					readByte = System.in.read();
					System.out.println(readByte);
					if(readByte == 97) {
						System.out.println("end of program");
						break;
					}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			
			}
			
			
		
		
	}
}
