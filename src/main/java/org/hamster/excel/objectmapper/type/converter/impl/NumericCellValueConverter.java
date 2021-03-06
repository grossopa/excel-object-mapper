/**
 * 
 */
package org.hamster.excel.objectmapper.type.converter.impl;

import org.hamster.excel.objectmapper.type.converter.AbstractClassCellValueConverter;
import org.hamster.excel.objectmapper.util.CellValueType;

/**
 *
 *
 * @author Yin, Jack
 * @since 1.0
 */
public class NumericCellValueConverter extends AbstractClassCellValueConverter<Number, Double> {

    /**
     * @param desiredClass
     */
    public NumericCellValueConverter() {
        super(Number.class);
    }

    @Override
    public Double process(Number object) {
        return object.doubleValue();
    }

    @Override
    public CellValueType getCellValueType() {
        return CellValueType.NUMERIC;
    }

}
