package com.dasoulte.tdd.third;

public class TestCaseTest3 extends TestCase3 {
	public TestCaseTest3(String name) {
		super(name);
	}

	WasRun3 wasRun3;

	@Override
	public void setUp() {
		wasRun3 = new WasRun3("testMethod");
	}

	public void testRunning() {
		Assert.assertEquals(false, wasRun3.wasRun);

		wasRun3.run();

		Assert.assertEquals(true, wasRun3.wasRun);
	}

	public void testSetup() {
		Assert.assertEquals(false, wasRun3.wasSetup);

		wasRun3.run();

		Assert.assertEquals(true, wasRun3.wasSetup);
	}
}
