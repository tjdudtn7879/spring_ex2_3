package com.lgy.spring_test;

public class DivAndRemains {
	int num;
	
	public void name() {
		if (num/10==num%10) {
			System.out.println(num+"는 10의자리와 1의자리가 같다");
		}else {
			System.out.println(num+"는 다르다");
		}
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
