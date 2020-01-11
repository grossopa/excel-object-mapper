/**
 * 
 */
package org.hamster.excel.objectmapper.type.converter;

/**
 *
 *
 * @author Yin, Jack
 * @since 1.0
 */
public abstract class AbstractSelfCellValueConverter<T> extends AbstractClassCellValueConverter<T, T> {

    protected AbstractSelfCellValueConverter(Class<T> desiredClass) {
        super(desiredClass);
    }

    @Override
    public T process(T object) {
        return object;
    }

}
