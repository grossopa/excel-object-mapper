/**
 * 
 */
package org.hamster.excel.objectmapper.column;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hamster.excel.objectmapper.model.ColumnCandidate;
import org.hamster.excel.objectmapper.model.ColumnDetails;
import org.hamster.excel.objectmapper.model.ObjectDetails;

import lombok.extern.slf4j.Slf4j;

/**
 *
 *
 * @author Yin, Jack
 * @since 1.0
 */
@Slf4j
public class ObjectDetailsBuilder {

    private ColumnCandidateProvider columnCandidateProvider;

    public ObjectDetails from(Class<?> clazz) {
        List<ColumnDetails> columnDetails = new ArrayList<>();
        List<ObjectDetails> children = new ArrayList<>();
        List<ColumnCandidate> columnCandidates = columnCandidateProvider.supplyFrom(clazz);
        columnCandidates.forEach(candidate -> {
            Class<?> candidateClass = candidate.getValueClass();
            if (clazz.isInstance(Collection.class)) {
                if (!candidate.isGenericTypedClass()) {
                    log.warn("Cannot find the generic type of {}#{}", clazz, candidate.getDisplayName());
                } else {
                    children.add(from((Class<?>) candidate.getGenericTypes()[0]));
                }

            }
        });

        return new ObjectDetails(null, children);

    }
}
