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

import static java.util.Objects.requireNonNull;

/**
 *
 *
 * @author Yin, Jack
 * @since 1.0
 */
@Slf4j
public class ObjectDetailsBuilder {

    public static final String ROOT = "ROOT";


    private final ColumnCandidateProvider columnCandidateProvider;

    public ObjectDetailsBuilder(ColumnCandidateProvider columnCandidateProvider) {
        requireNonNull(columnCandidateProvider);
        this.columnCandidateProvider = columnCandidateProvider;
    }

    public ObjectDetails from(ColumnCandidate parent, Class<?> clazz) {
        List<ColumnDetails> columnDetailsList = new ArrayList<>();
        List<ObjectDetails> children = new ArrayList<>();
        List<ColumnCandidate> columnCandidates = columnCandidateProvider.supplyFrom(clazz);
        columnCandidates.forEach(candidate -> {
            Class<?> candidateClass = candidate.getValueClass();
            if (clazz.isInstance(Collection.class)) {
                if (!candidate.isGenericTypedClass()) {
                    log.warn("Cannot find the generic type of {}#{}", clazz, candidate.getDisplayName());
                } else {
                    children.add(from(parent, (Class<?>) candidate.getGenericTypes()[0]));
                }
            } else {
                columnDetailsList.add(new ColumnDetails(candidate.getDisplayName(), candidate.getValueClass(), candidate.getValueExtractor()));
            }
        });

        return new ObjectDetails(parent, columnDetailsList, children);

    }

}
