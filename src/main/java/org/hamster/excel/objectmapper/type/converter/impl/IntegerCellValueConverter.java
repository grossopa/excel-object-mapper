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
public class IntegerCellValueConverter extends AbstractSelfCellValueConverter<Integer> {

    /**
     * @param desiredClass
     */
    protected IntegerCellValueConverter() {
        super(Integer.class);
    }

    @Override
    public CellValueType getCellValueType() {
        return CellValueType.INTEGER;
    }

}
