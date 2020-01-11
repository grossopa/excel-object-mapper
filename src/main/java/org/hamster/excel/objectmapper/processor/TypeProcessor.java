/**
 * 
 */
package org.hamster.excel.objectmapper.processor;

import org.hamster.excel.objectmapper.type.JavaType;

/**
 *
 *
 * @author Yin, Jack
 * @since 1.0
 */
public interface TypeProcessor {
    
    /**
     * 
     * 
     * @param clazz
     * @return
     */
    JavaType detect(Class<?> clazz);
}
