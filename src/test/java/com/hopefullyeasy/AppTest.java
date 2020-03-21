package com.hopefullyeasy;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void testAdd() {
		App a=new App();
		assertEquals(a.add(1, 1),2);
	}
	@Test
	public void testSub() {
		App a=new App();
		assertEquals(a.sub(1, 1),0);
	}

}
