/**
 * 
 */
package org.hamster.excel.objectmapper.model;

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
    private final Class<?> valueClass;
    private final ValueExtractor<?> valueExtractor;
}
