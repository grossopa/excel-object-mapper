/**
 * 
 */
package org.hamster.excel.objectmapper.type;

/**
 *
 *
 * @author Yin, Jack
 * @since 1.0
 */
public class NumericType extends AbstractJavaType {

    /**
     * @param clazz
     */
    public NumericType(Class<?> clazz) {
        super(clazz);
    }

    @Override
    public boolean isReferenceType() {
        return false;
    }

    @Override
    public boolean isContainerType() {
        return false;
    }

}
