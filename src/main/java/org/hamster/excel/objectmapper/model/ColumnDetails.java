/**
 * 
 */
package org.hamster.excel.objectmapper.model;

import org.hamster.excel.objectmapper.type.value.ValueExtractor;
import org.hamster.excel.objectmapper.util.CellValueType;

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
public class ColumnDetails {
    private final String headerName;
    private final CellValueType valueType;
    private final ValueExtractor<?> valueExtractor;

}
