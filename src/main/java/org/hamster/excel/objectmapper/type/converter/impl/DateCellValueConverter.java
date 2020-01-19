/**
 * 
 */
package org.hamster.excel.objectmapper.type.converter.impl;

import java.util.Date;

import org.hamster.excel.objectmapper.type.converter.AbstractSelfCellValueConverter;
import org.hamster.excel.objectmapper.util.CellValueType;

/**
 *
 *
 * @author Yin, Jack
 * @since 1.0
 */
public class DateCellValueConverter extends AbstractSelfCellValueConverter<Date> {

    /**
     * @param desiredClass
     */
    protected DateCellValueConverter() {
        super(Date.class);
    }

    @Override
    public CellValueType getCellValueType() {
        return CellValueType.DATE;
    }

}
