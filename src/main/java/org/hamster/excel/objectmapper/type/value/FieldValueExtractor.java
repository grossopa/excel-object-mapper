/**
 * 
 */
package org.hamster.excel.objectmapper.type.value;

import java.lang.reflect.Field;
import java.util.Optional;

import org.hamster.excel.objectmapper.exception.ExtractValueException;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * extracts a value from Field
 *
 * @author Yin, Jack
 * @since 1.0
 */
@AllArgsConstructor
public class FieldValueExtractor implements ValueExtractor<Field> {

    @Getter
    private final Field source;

    @Override
    public Optional<Object> extract(Object targetObject) {
        boolean accessible = source.isAccessible();
        source.setAccessible(true);
        try {
            return Optional.ofNullable(source.get(targetObject));
        } catch (IllegalArgumentException | IllegalAccessException e) {
            throw new ExtractValueException("Failed to extract value from " + targetObject, e);
        } finally {
            source.setAccessible(accessible);
        }

    }

}
