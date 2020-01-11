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
public class StringType extends AbstractJavaType {

    /**
     * 
     * @param clazz
     */
    public StringType(Class<?> clazz) {
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
