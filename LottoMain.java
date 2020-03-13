package com.lotto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LottoMain {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Lotto ob = new LottoImpl();
		
		String set ;
		
		System.out.println("=====================");
		System.out.println(" <로또자동번호판매>");
		System.out.println(" 1.판매 2.매출 3.종료");
		System.out.println();
		System.out.println("=====================");
		System.out.print("> ");
		set = br.readLine();
		
		switch(set) {
		case "1" :
			ob.getNum();
			break;
		case "2" :
			ob.sale();
			break;
		case "3" :
			System.out.println("종료");
			System.exit(0);
		default :
			System.out.println("잘못입력 하였습니다.");
		}
		
	}
}
