/**
 * 
 */
package org.hamster.excel.objectmapper.type.converter.impl;

import org.hamster.excel.objectmapper.type.converter.AbstractSelfCellValueConverter;
import org.hamster.excel.objectmapper.util.CellValueType;

/**
 *
 *
 * @author Yin, Jack
 * @since 1.0
 */
public class BooleanCellValueConverter extends AbstractSelfCellValueConverter<Boolean> {

    /**
     * @param desiredClass
     */
    protected BooleanCellValueConverter() {
        super(Boolean.class);
    }

    @Override
    public CellValueType getCellValueType() {
        return CellValueType.BOOLEAN;
    }

}
