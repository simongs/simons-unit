package com.dasoulte.tdd.third;

public class PureJavaThridTest {

	/**
	 * 	첫번째 순수 자바로만 만드는 테스트
	 */
	public static void main(String args[]) {
		new TestCaseTest3("testRunning").run();
		new TestCaseTest3("testSetup").run();
	}
}
