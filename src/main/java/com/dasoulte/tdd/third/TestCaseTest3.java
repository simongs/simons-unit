package com.dasoulte.tdd.third;

public class TestCaseTest3 extends TestCase3 {
	public TestCaseTest3(String name) {
		super(name);
	}

	WasRun3 wasRun3;

	public static TestSuite suite() {
		TestSuite suite = new TestSuite();
		suite.add(new TestCaseTest3("testTemplateMethod"));
		suite.add(new TestCaseTest3("testResult"));
		suite.add(new TestCaseTest3("testFailedResultFormatting"));
		suite.add(new TestCaseTest3("testFailedResult"));
		return suite;
	}

	@Override
	public void setUp() {
		wasRun3 = new WasRun3("testMethod");
	}

	public void testTemplateMethod() {
		WasRun3 wasRun3 = new WasRun3("testMethod");

		wasRun3.run(new TestResult());

		Assert.assertEquals("setup testMethod tearDown", wasRun3.log);
	}

	public void testResult() {
		WasRun3 wasRun3 = new WasRun3("testMethod");

		TestResult result = new TestResult();
		wasRun3.run(result);

		Assert.assertEquals("1 run, 0 failed", result.getSummary());
	}

	public void testFailedResultFormatting() {
		TestResult result = new TestResult();
		result.testStarted();
		result.testFailed();

		Assert.assertEquals("1 run, 1 failed", result.getSummary());
	}


	public void testFailedResult() {
		WasRun3 wasRun3 = new WasRun3("testBrokenMethod");
		TestResult result = new TestResult();
		wasRun3.run(result);
		Assert.assertEquals("1 run, 1 failed", result.getSummary());
	}

	public void testSuite() {
		TestSuite suite = new TestSuite();
		suite.add(new WasRun3("testBrokenMethod"));
		suite.add(new WasRun3("testMethod"));

		TestResult testResult = new TestResult();
		suite.run(testResult);
		Assert.assertEquals("2 run, 1 failed", testResult.getSummary());
	}

}
