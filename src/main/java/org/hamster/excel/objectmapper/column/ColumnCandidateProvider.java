/**
 * 
 */
package org.hamster.excel.objectmapper.column;

import java.util.List;

import org.hamster.excel.objectmapper.model.ColumnCandidate;

/**
 *
 *
 * @author Yin, Jack
 * @since 1.0
 */
public interface ColumnCandidateProvider {

    List<ColumnCandidate> supplyFrom(Class<?> clazz);
}
