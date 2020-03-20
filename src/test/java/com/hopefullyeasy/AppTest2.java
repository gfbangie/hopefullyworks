package com.hopefullyeasy;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest2 {

	@Test
	public void testAdd() {
		App a=new App();
		assertEquals(a.add(1, 1),0);
	}

}
