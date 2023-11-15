package com.gyang.interfaces;

public interface AnotherInterface {

	default String getName() {
		return "AnotherInterface";
	}
	
	static String getQName() {
		return "com.gyang.interfaces.AnotherInterface";
	}
}
