
package com.gyang;

import java.io.ObjectInputFilter.Config;

public final class Example {
	public final boolean setValue(boolean newValue) {
		StaticExample.setValue(newValue);

		System.setProperty("name", "zijun");
		System.setProperty("gender", "female");
		
		boolean x = newValue;	
		if ( x == true) {
		    return true;
		}
		else {
		    return false;
		}
		        
	
	}
}
