package com.lotto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LottoMain {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Lotto ob = new LottoImpl();

		String set;

		while (true) {
			System.out.println("=====================");
			System.out.println("   <�ζ��ڵ���ȣ�Ǹ�>");
			System.out.println(" 1.�Ǹ� 2.���� 3.����");
			System.out.println();
			System.out.println("=====================");
			System.out.print("> ");
			set = br.readLine();

			switch (set) {
			case "1":
				ob.input();
				break;
			case "2":
				ob.getSales();
				break;
			case "3":
				System.out.println("����");
				System.exit(0);
			default:
				System.out.println("�߸��Է� �Ͽ����ϴ�.");
			}
		}

	}
}
