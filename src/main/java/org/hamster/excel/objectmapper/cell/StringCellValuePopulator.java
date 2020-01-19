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
public class StringCellValuePopulator implements CellValuePopulator<String> {

    @Override
    public void accept(String value, Cell cell) {
        cell.setCellValue(value);
    }

}
