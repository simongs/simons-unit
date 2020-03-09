package com.dasoulte.tdd.second;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 1 단계 WasRun 에서 공통으로 사용할 수 있는 메소드 정보를 뽑아낸다.
 */
public class TestCase {
	protected final String name;

	public TestCase(String name) {
		this.name = name;
	}

	public void run() {
		try {
			Method method = getClass().getMethod(name);
			method.invoke(this);
		} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
			throw new RuntimeException(e);
		}
	}
}
