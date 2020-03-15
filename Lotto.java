package com.lotto;

import java.io.IOException;

public interface Lotto {
	
	public void input() throws IOException;
	public void getNum();
	public int[] randomSort(int[] num);
	public void print();
	public void getSales();

}
