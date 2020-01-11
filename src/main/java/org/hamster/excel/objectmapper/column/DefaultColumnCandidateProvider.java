/**
 * 
 */
package org.hamster.excel.objectmapper.column;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.hamster.excel.objectmapper.model.ColumnCandidate;

/**
 *
 *
 * @author Yin, Jack
 * @since 1.0
 */
public class DefaultColumnCandidateProvider implements ColumnCandidateProvider {

    @Override
    public List<ColumnCandidate> supplyFrom(Class<?> clazz) {
        // TODO configurable
        List<ColumnCandidateProvider> providers = new ArrayList<>();
        providers.add(new FieldColumnCandidateProvider());
        providers.add(new GetterMethodColumnCandidateProvider());

        Map<String, ColumnCandidate> resultMap = new LinkedHashMap<>();
        providers.forEach(provider -> provider.supplyFrom(clazz)
                .forEach(candidate -> resultMap.put(candidate.getName(), candidate)));

        return new ArrayList<>(resultMap.values());
    }

}
