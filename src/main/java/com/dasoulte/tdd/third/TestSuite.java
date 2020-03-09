package com.dasoulte.tdd.third;

import com.google.common.collect.Lists;

import java.util.List;

public class TestSuite implements Test {
	List<Test> tests = Lists.newArrayList();

	public void add(Test testCase) {
		tests.add(testCase);
	}

	public void run(TestResult testResult) {
		tests.forEach(t -> {
			t.run(testResult);
		});
	}
}
