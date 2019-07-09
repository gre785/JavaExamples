/**
 * 
 */
package com.gyang.exmaples;

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for MyClass
 *
 * @see com.gyang.exmaples.MyClass
 * @author gyang
 */
public class MyClassTest {

	/**
	 * Parasoft Jtest UTA: Test for getObject()
	 *
	 * @see com.gyang.exmaples.MyClass#getObject()
	 * @author gyang
	 */
	@Test
	public void testGetObject() throws Throwable {
		// Given
		MyClass underTest = new MyClass();

		// When
		MyClass result = underTest.getObject();

		// Then
		// assertNotNull(result);
	}
}