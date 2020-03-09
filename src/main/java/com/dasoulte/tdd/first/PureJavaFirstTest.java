package com.dasoulte.tdd.first;

public class PureJavaFirstTest {

	/**
	 * 	첫번째 순수 자바로만 만드는 테스트
	 */
	public static void main(String args[]) {
		WasRun wasRun = new WasRun("testMethod");

		System.out.println(wasRun.wasRun); // false
		wasRun.run();

		System.out.println(wasRun.wasRun); // true
	}
}
