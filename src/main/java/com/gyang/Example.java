
package com.gyang;

public final class Example {
	public final void setValue(boolean newValue) {
		StaticExample.setValue(newValue);

		System.setProperty("name", "zijun");
		System.setProperty("gender", "female");
	}
}
