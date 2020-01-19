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
public class IntegerCellValuePopulator implements CellValuePopulator<Integer> {

    @Override
    public void accept(Integer value, Cell cell) {
        cell.setCellValue(value);
    }

}
