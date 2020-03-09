package com.dasoulte.tdd.third;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 1 단계 WasRun 에서 공통으로 사용할 수 있는 메소드 정보를 뽑아낸다.
 */
public class TestCase3 implements Test {
	protected final String name;

	public TestCase3(String name) {
		this.name = name;
	}

	public void tearDown() {
	}

	public void setUp() {

	}

	public void run(TestResult testResult) {
		testResult.testStarted();

		setUp();

		try {
			Method method = getClass().getMethod(name);
			method.invoke(this);
		} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
			testResult.testFailed();
		}

		tearDown();
	}
}
