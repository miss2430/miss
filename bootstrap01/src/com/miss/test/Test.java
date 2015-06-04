package com.miss.test;

public class Test {
	public static void main(String[] args) {
		N n = new N();
		for (int i = 0; i < n.getI(); i++) {
			System.out.println(i);
		}
	}
}

class N {
	private int i = 4;

	public int getI() {
		System.out.println(i);
		return i;
	}
}
