/**
 * 
 */
package org.hamster.excel.objectmapper.cell;

import java.util.function.BiConsumer;

import org.apache.poi.ss.usermodel.Cell;

/**
 *
 *
 * @author Yin, Jack
 * @since 1.0
 */
public interface CellValuePopulator<T> extends BiConsumer<T, Cell> {

}
