package com.hopefullyeasy;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest2 {
	@Test
	public void testAdd() {
		App calc = new App();
		assertEquals(calc.add(1, 1), 2);
	}
	@Test
	public void testSub() {
		App calc = new App();
		assertEquals(calc.sub(1, 1), 0);
	}
	@Test
	public void testMul() {
		App calc = new App();
		assertEquals(calc.mul(3, 5), 15);
	}
	@Test
	public void testDiv() {
		App calc = new App();
		assertEquals(calc.div(8, 2), 3);
	}

}
