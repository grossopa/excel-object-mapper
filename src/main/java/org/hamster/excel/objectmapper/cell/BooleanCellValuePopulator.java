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
public class BooleanCellValuePopulator implements CellValuePopulator<Boolean> {

    @Override
    public void accept(Boolean value, Cell cell) {
        cell.setCellValue(value);
    }

}
