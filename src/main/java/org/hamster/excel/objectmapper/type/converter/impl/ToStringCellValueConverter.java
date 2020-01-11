/**
 * 
 */
package org.hamster.excel.objectmapper.type.converter.impl;

import org.hamster.excel.objectmapper.type.converter.CellValueConverter;

/**
 *
 *
 * @author Yin, Jack
 * @since 1.0
 */
public class ToStringCellValueConverter implements CellValueConverter<Object, String> {

    @Override
    public boolean needProcess(Class<?> clazz) {
        return true;
    }

    @Override
    public String process(Object object) {
        return object.toString();
    }

}
