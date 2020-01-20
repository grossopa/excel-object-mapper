/**
 * 
 */
package org.hamster.excel.objectmapper.sheet;

import org.apache.poi.ss.usermodel.Sheet;

/**
 *
 *
 * @author Yin, Jack
 * @since 1.0
 */
public interface SheetLayoutEngine {

    Sheet layout(Sheet sheet, int column, int row);
}
