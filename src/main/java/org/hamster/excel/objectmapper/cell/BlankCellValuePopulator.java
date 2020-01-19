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
public class BlankCellValuePopulator implements CellValuePopulator<Void> {

    @Override
    public void accept(Void nullValue, Cell cell) {
        cell.setBlank();
    }

}
