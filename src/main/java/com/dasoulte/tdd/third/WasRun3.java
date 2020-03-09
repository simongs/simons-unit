package com.dasoulte.tdd.third;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WasRun3 extends TestCase3 {
	public boolean wasRun;
	public boolean wasSetup;

	@Override
	public void setUp() {
		wasSetup = true;
	}

	public WasRun3(String name) {
		super(name);
	}

	public void testMethod() {
		wasRun = true;
	}

}
