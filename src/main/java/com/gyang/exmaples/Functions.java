
package com.gyang.exmaples;

import java.io.Serializable;

import org.springframework.lang.Nullable;

import com.google.common.base.Function;
import com.google.common.base.Objects;

public class Functions
{
    public static <E> Function<Object, E> constant(@Nullable E value)
    {
        return new ConstantFunction<E>(value);
    }

    private static class ConstantFunction<E>
        implements Function<Object, E>, Serializable
    {
        private final E value;

        public ConstantFunction(@Nullable E value)
        {
            this.value = value;
        }

        @Override
        public E apply(@Nullable Object from)
        {
            return value;
        }

        @Override
        public boolean equals(@Nullable Object obj)
        {
            if (obj instanceof ConstantFunction) {
                ConstantFunction<?> that = (ConstantFunction<?>)obj;
                return Objects.equal(value, that.value);
            }
            return false;
        }

        @Override
        public int hashCode()
        {
            return (value == null) ? 0 : value.hashCode();
        }

        @Override
        public String toString()
        {
            return "constant(" + value + ")";
        }

        private static final long serialVersionUID = 0;
    }
}
