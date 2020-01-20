/**
 * 
 */
package org.hamster.excel.objectmapper.model;

import java.lang.reflect.Type;

import org.apache.commons.lang3.ArrayUtils;
import org.hamster.excel.objectmapper.type.value.ValueExtractor;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 *
 * @author Yin, Jack
 * @since 1.0
 */
@Getter
@AllArgsConstructor
public class ColumnCandidate {
    private final String name;
    private final String displayName;
    private final Class<?> valueClass;
    private final Type[] genericTypes;
    private final ValueExtractor<?> valueExtractor;

    public boolean isGenericTypedClass() {
        return !ArrayUtils.isEmpty(genericTypes);
    }
}
