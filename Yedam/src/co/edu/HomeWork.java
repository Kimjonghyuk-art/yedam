package co.edu;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		
		/*
		 * 물건의 가격과 현금. [현금] 10000원 
		 * [물건가격] 7500원 [부가세] 750원
		 *  [잔돈] 2500원.
		 */	
		int productPrice; //상품 가격
		int payout; // 지불금 
		int changes; // 잔돈
		double vat; //부가세
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("얼마짜리 상품? ");
		productPrice = scn.nextInt();
		System.out.println("얼마를 지불하시게?");
		payout = scn.nextInt();
		
		changes = payout - productPrice;
		vat = productPrice*0.1;
		
		System.out.println("손님이 주신 돈은 " + payout);
		System.out.println("상품 가격은 " + productPrice);
		System.out.println("부가세는 " + vat);
		System.out.println("잔돈은 " + changes);
	}

}
