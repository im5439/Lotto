package com.lotto;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LottoImpl implements Lotto {

	Scanner sc = new Scanner(System.in);

	int count;

	ArrayList<LottoVO> list = new ArrayList<>();

	@Override
	public void input() {

		do {
			System.out.print("판매 장수(최대 20장) :");
			count = sc.nextInt();
		} while (count < 1 || count > 20);

		print();

	}

	@Override
	public void getNum() { // 랜덤 숫자 6개 5번을 ArrayList에 저장

		LottoVO vo = new LottoVO();

		int[] num1 = new int[6];
		randomSort(num1);
		int[] num2 = new int[6];
		randomSort(num2);
		int[] num3 = new int[6];
		randomSort(num3);
		int[] num4 = new int[6];
		randomSort(num4);
		int[] num5 = new int[6];
		randomSort(num5);

		vo.setLotnum1(num1);
		vo.setLotnum2(num2);
		vo.setLotnum3(num3);
		vo.setLotnum4(num4);
		vo.setLotnum5(num5);

		list.add(vo);

		for (int i = 0; i < 6; i++) {
			int[] num = vo.getLotnum1();
			System.out.printf("%3d", num[i]);
		}
		System.out.println();
		for (int i = 0; i < 6; i++) {
			int[] num = vo.getLotnum2();
			System.out.printf("%3d", num[i]);
		}
		System.out.println();
		for (int i = 0; i < 6; i++) {
			int[] num = vo.getLotnum3();
			System.out.printf("%3d", num[i]);
		}
		System.out.println();
		for (int i = 0; i < 6; i++) {
			int[] num = vo.getLotnum4();
			System.out.printf("%3d", num[i]);
		}
		System.out.println();
		for (int i = 0; i < 6; i++) {
			int[] num = vo.getLotnum5();
			System.out.printf("%3d", num[i]);
		}
		System.out.println();

	}

	@Override
	public int[] randomSort(int[] num) { // 숫자 6개를 오름차순으로 랜덤값 구함

		Random rd = new Random();

		int n = 0;
		while (n < 6) {
			num[n] = rd.nextInt(45) + 1;
			for (int i = 0; i < n; i++) {
				if (num[i] == num[n]) {
					n--;
					break;
				}
			}
			n++;
		}

		int temp = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = i + 1; j < 6; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

		int[] arr = new int[6];
		for (int i = 0; i < num.length; i++) {
			arr[i] = num[i];
		}

		return arr;
	}

	@Override
	public void print() {

		for (int i = 0; i < count; i++) {
			System.out.println("---------" + (i + 1) + "장" + "---------");
			getNum();
			System.out.println("--------------------");
		}

	}

	@Override
	public void getSales() {

//		int sales = 0;
//		sales += count;
//		System.out.println(sales*5000);

		int sales = list.size();
		System.out.println("[총매출]");
		System.out.println(sales * 5000 + "원");

	}

}
