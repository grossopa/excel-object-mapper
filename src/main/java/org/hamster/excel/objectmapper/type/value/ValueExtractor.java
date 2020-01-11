/**
 * 
 */
package org.hamster.excel.objectmapper.type.value;

import java.util.Optional;

/**
 * Extracts the value from object
 *
 * @author Yin, Jack
 * @since 1.0
 */
public interface ValueExtractor<T> {

    Optional<Object> extract(Object targetObject);

    T getSource();

}
