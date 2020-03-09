package com.dasoulte.tdd.third;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WasRun3 extends TestCase3 {
	public String log;

	@Override
	public void setUp() {
		log = "setup";
	}

	public WasRun3(String name) {
		super(name);
	}

	public void testMethod() {
		log += " testMethod";
	}

	@Override
	public void tearDown() {
		log += " tearDown";
	}

	public void testBrokenMethod() {
		throw new RuntimeException("test Broken Method");
	}
}
