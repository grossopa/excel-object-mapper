/**
 * 
 */
package org.hamster.excel.objectmapper.type.converter;

/**
 * Converts the object into target type, see each implementation
 *
 * @param <T> the target class type
 * @author Yin, Jack
 * @since 1.0
 */
public interface CellValueConverter<T, R> {
    
    /**
     * 
     * 
     * @param clazz
     * @return
     */
    boolean needProcess(Class<?> clazz);
    
    /**
     * 
     * 
     * @param object
     * @return
     */
    R process(T object);
}
