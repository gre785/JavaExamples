/**
 * 
 */
package com.gyang.examples;

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for MyClass
 *
 * @see MyClass
 * @author gyang
 */
public class MyClassTest {

	/**
	 * Parasoft Jtest UTA: Test for getObject()
	 *
	 * @see MyClass#getObject()
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