package com.dasoulte.tdd.third;

public class TestBootStrap {

	/**
	 * 	첫번째 순수 자바로만 만드는 테스트
	 */
	public static void main(String args[]) {
		TestSuite suite = TestCaseTest3.suite();

		/*new TestCaseTest3("testTemplateMethod").run();
		new TestCaseTest3("testResult").run();
		new TestCaseTest3("testFailedResultFormatting").run();
		new TestCaseTest3("testFailedResult").run();*/

		TestResult testResult = new TestResult();
		suite.run(testResult);
		System.out.println(testResult.getSummary());


	}
}
