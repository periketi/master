package com.Calc;

import static org.junit.Assert.*;
import org.junit.Test;

public class AdditionTest {

	@Test
	public void testAdd() {
		Addition ad = new Addition();
		assertEquals(6, ad.add(3, 3));
	}

}
