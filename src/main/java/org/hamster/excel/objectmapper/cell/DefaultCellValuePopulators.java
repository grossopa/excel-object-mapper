/**
 * 
 */
package org.hamster.excel.objectmapper.cell;

import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.hamster.excel.objectmapper.util.CellValueType.BiFunc;

/**
 *
 *
 * @author Yin, Jack
 * @since 1.0
 */
public class DefaultCellValuePopulators implements BiFunc<Object, Cell, Cell> {

    @Override
    public Cell applyNumeric(Object value, Cell cell) {
        new NumericCellValuePopulator().accept((Double) value, cell);
        return cell;
    }

    @Override
    public Cell applyInteger(Object value, Cell cell) {
        new IntegerCellValuePopulator().accept((Integer) value, cell);
        return cell;
    }

    @Override
    public Cell applyDate(Object value, Cell cell) {
        new DateCellValuePopulator().accept((Date) value, cell);
        return cell;
    }

    @Override
    public Cell applyString(Object value, Cell cell) {
        new StringCellValuePopulator().accept((String) value, cell);
        return cell;
    }

    @Override
    public Cell applyBoolean(Object value, Cell cell) {
        new BooleanCellValuePopulator().accept((Boolean) value, cell);
        return cell;
    }

    @Override
    public Cell applyBlank(Object value, Cell cell) {
        new BlankCellValuePopulator().accept(null, cell);
        return cell;
    }

    @Override
    public Cell applyError(Object value, Cell cell) {
        throw new UnsupportedOperationException();
    }

}
