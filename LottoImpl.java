package com.lotto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class LottoImpl implements Lotto {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int count;

	ArrayList<LottoVO> list = new ArrayList<>();

	@Override
	public void input() throws IOException {

//		do {
//			System.out.print("�Ǹ� ���(�ִ� 20��) :");
//			count = br.read();
//		} while (count < 1 || count > 20);

		
		getNum();
		
//		print();

	}

	@Override
	public void getNum() { // ���� ���� 6�� 5���� ArrayList�� ����

		LottoVO vo = new LottoVO();

		int[] num1 = new int[6];
		randomSort(num1);
		
		vo.setLotnum1(num1);
		vo.setLotnum2(num1);
		vo.setLotnum3(num1);
		vo.setLotnum4(num1);
		vo.setLotnum5(num1);
		
		list.add(vo);
		
		vo.getLotnum1();

	}

	@Override
	public int[] randomSort(int[] num) { // ���� 6���� ������������ ������ ����

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

		Iterator<LottoVO> it = list.iterator();
		
		while(it.hasNext()) {
			
			LottoVO vo = it.next();
			for(int i = 0; i < 6; i++) {
			System.out.println(vo.getLotnum1());
			}
		}

		
		
	}

	@Override
	public void sale() {
		// TODO Auto-generated method stub

	}

}
