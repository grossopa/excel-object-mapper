/**
 * 
 */
package org.hamster.excel.objectmapper.type.value;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Optional;

import org.hamster.excel.objectmapper.exception.ExtractValueException;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 *
 * @author Yin, Jack
 * @since 1.0
 */
@AllArgsConstructor
public class MethodValueExtractor implements ValueExtractor<Method> {

    @Getter
    private final Method source;

    @Override
    public Optional<Object> extract(Object targetObject) {
        boolean accessible = source.isAccessible();
        source.setAccessible(true);
        try {
            return Optional.ofNullable(source.invoke(targetObject));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new ExtractValueException("Failed to extract value from " + targetObject, e);
        } finally {
            source.setAccessible(accessible);
        }
    }

}
