/**
 * 
 */

package com.gyang.exmaples;

import com.google.common.base.Function;
import org.junit.Test;

public class FunctionsTest
{
    @Test
    public <E> void testConstant()
        throws Throwable
    {
        // When
        Object value = new Object(); // UTA: default value
        Function<Object, Object> result = Functions.constant(value);

    }
}
