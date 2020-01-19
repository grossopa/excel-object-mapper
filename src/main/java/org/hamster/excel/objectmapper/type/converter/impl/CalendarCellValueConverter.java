/**
 * 
 */
package org.hamster.excel.objectmapper.type.converter.impl;

import java.util.Calendar;
import java.util.Date;

import org.hamster.excel.objectmapper.type.converter.AbstractClassCellValueConverter;
import org.hamster.excel.objectmapper.util.CellValueType;

/**
 *
 *
 * @author Yin, Jack
 * @since 1.0
 */
public class CalendarCellValueConverter extends AbstractClassCellValueConverter<Calendar, Date> {

    /**
     * @param desiredClass
     */
    protected CalendarCellValueConverter() {
        super(Calendar.class);
    }

    @Override
    public Date process(Calendar object) {
        return object.getTime();
    }

    @Override
    public CellValueType getCellValueType() {
        return CellValueType.DATE;
    }

}
