/**
 * 
 */
package org.hamster.excel.objectmapper.column;

import static java.util.Arrays.stream;
import static java.util.regex.Pattern.compile;
import static java.util.stream.Collectors.toList;
import static org.apache.commons.lang3.StringUtils.uncapitalize;

import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.Pattern;

import org.hamster.excel.objectmapper.model.ColumnCandidate;
import org.hamster.excel.objectmapper.type.value.MethodValueExtractor;

/**
 *
 *
 * @author Yin, Jack
 * @since 1.0
 */
public class GetterMethodColumnCandidateProvider implements ColumnCandidateProvider {

    static Pattern p = compile("^is|get[A-Z]+[\\S]*");

    @Override
    public List<ColumnCandidate> supplyFrom(Class<?> clazz) {
        Method[] methods = clazz.getMethods();
        return stream(methods)
                // method with no parameters
                .filter(m -> m.getParameterCount() == 0)
                // filter out getClass
                .filter(m -> !"getClass".equals(m.getName()))
                // starts with is or get
                .filter(m -> p.matcher(m.getName()).matches()).map(m -> {
                    String mn = m.getName();
                    String name = mn.startsWith("is") ? mn.substring(2) : mn.substring(3);
                    return new ColumnCandidate(uncapitalize(name), name, m.getReturnType(),
                            m.getGenericParameterTypes(), new MethodValueExtractor(m));
                }).collect(toList());
    }

}
