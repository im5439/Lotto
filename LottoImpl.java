package com.lotto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class LottoImpl implements Lotto {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int count;

	@Override
	public void input() throws IOException {

		do {
			System.out.print("판매 장수(최대 20장) :");
			count = br.read();
		} while (count < 1 || count > 20);

	}

	@Override
	public void getNum() {

		Random rd = new Random();

		int[] num1 = new int[6];
		int n = 0;
		while (n < 6) {
			num1[n] = rd.nextInt(45) + 1;
			for (int i = 0; i < n; i++) {
				if (num1[i] == num1[n]) {
					n--;
					break;
				}
			}
			n++;
		}
		
		int temp = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = i + 1; j < 6; j++) {
				if(num1[i] > num1[j]) {
					temp = num1[i];
					num1[i] = num1[j];
					num1[j] = temp;
				}
			}
		}
		int[] arr = new int[6];
		for(int i = 0; i < num1.length; i++) {
			arr[i] = num1[i];
		}
		
	}

	@Override
	public void randomSort() {
		// TODO Auto-generated method stub

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sale() {
		// TODO Auto-generated method stub

	}

}
