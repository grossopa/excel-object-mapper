/**
 * 
 */
package org.hamster.excel.objectmapper.type.converter;

import static java.util.Objects.requireNonNull;

/**
 *
 *
 * @author Yin, Jack
 * @since 1.0
 */
public abstract class AbstractClassCellValueConverter<T, R> implements CellValueConverter<T, R> {

    protected Class<T> desiredClass;

    protected AbstractClassCellValueConverter(Class<T> desiredClass) {
        requireNonNull(desiredClass);
        this.desiredClass = desiredClass;
    }

    @Override
    public boolean needProcess(Class<?> clazz) {
        return desiredClass.isAssignableFrom(clazz);
    }

}
