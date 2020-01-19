/**
 * 
 */
package org.hamster.excel.objectmapper.cell;

import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;

/**
 *
 *
 * @author Yin, Jack
 * @since 1.0
 */
public class DateCellValuePopulator implements CellValuePopulator<Date> {

    @Override
    public void accept(Date input, Cell cell) {
        cell.setCellValue(input);
    }

}
