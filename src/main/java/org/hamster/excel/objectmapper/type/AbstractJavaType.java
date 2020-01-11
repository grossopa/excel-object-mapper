/**
 * 
 */
package org.hamster.excel.objectmapper.type;

import java.util.Objects;

/**
 *
 *
 * @author Yin, Jack
 * @since 1.0
 */
public abstract class AbstractJavaType implements JavaType {

    protected final Class<?> clazz;

    public AbstractJavaType(Class<?> clazz) {
        Objects.requireNonNull(clazz);
        this.clazz = clazz;
    }

    @Override
    public Class<?> getRawClass() {
        return clazz;
    }

}
