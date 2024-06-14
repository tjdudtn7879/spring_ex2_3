package com.lgy.spring_test;

public class Three {
	int num;
	
	public void calc() {
		if (num%3==0) {
			System.out.println(num+"는 3의 배수");
		} else {
			System.out.println(num+"는 3의배수가 아님");
		}
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
