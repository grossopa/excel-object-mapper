/**
 * 
 */
package org.hamster.excel.objectmapper.cell;

import org.apache.poi.ss.usermodel.Cell;

/**
 *
 *
 * @author Yin, Jack
 * @since 1.0
 */
public class NumericCellValuePopulator implements CellValuePopulator<Double> {

    @Override
    public void accept(Double value, Cell cell) {
        cell.setCellValue(value);
    }

}
