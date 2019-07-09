/**
 * 
 */
package com.gyang;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

/**
 * Parasoft Jtest UTA: Test class for ForObject
 *
 * @see com.gyang.ForObject
 * @author gyang
 */
@RunWith(Parameterized.class)
public class ForObjectParameterizedTest {

	int value;
	int expected;

	public ForObjectParameterizedTest(int value, int expected) {
		this.value = value;
		this.expected = expected;
	}

	// Parasoft Jtest UTA: Initialize test parameters
	@Parameters(name = "Run {index}: value={0}, expected={1}")
	public static Iterable<Object[]> data() throws Throwable {
		return Arrays.asList(new Object[][] { { 0, 0 }});
	}

	/**
	 * Parasoft Jtest UTA: Test for absolute(int)
	 *
	 * @see com.gyang.ForObject#absolute(int)
	 * @author gyang
	 */
	@Test
	public void testAbsolute() throws Throwable {
		ForObject underTest = new ForObject();

		int result = underTest.absolute(value);

		// assertEquals(expected, result);
	}
}