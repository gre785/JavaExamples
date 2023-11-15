package com.gyang.interfaces;

public interface SubInterface extends AnotherInterface, ForInterface {

	@Override
	default String getName() {
		return AnotherInterface.super.getName();
	}

}
