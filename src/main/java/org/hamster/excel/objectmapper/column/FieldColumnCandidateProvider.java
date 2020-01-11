/**
 * 
 */
package org.hamster.excel.objectmapper.column;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

import java.lang.reflect.Field;
import java.util.List;

import org.hamster.excel.objectmapper.model.ColumnCandidate;
import org.hamster.excel.objectmapper.type.value.FieldValueExtractor;

/**
 *
 *
 * @author Yin, Jack
 * @since 1.0
 */
public class FieldColumnCandidateProvider implements ColumnCandidateProvider {

    @Override
    public List<ColumnCandidate> supplyFrom(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        return stream(fields).map(f -> new ColumnCandidate(f.getName(), f.getType(), new FieldValueExtractor(f)))
                .collect(toList());
    }

}
