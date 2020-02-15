/**
 * 
 */
package org.hamster.excel.objectmapper.model;

import java.util.List;

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
public class ObjectDetails {
    private final ColumnCandidate parentCandidate;
    private final List<ColumnDetails> columns;
    private final List<ObjectDetails> children;
}
