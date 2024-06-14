package com.lgy.spring_test;

public class ThreeDivAndRemains {
	public static void main(String[] args) {
		Three three=new Three();
		DivAndRemains dar=new DivAndRemains();
		
		three.setNum(129);
		dar.setNum(77);
		
		three.calc();
		dar.name();
	}
}
