/**
 * 
 */
package org.hamster.excel.objectmapper;

import java.util.List;

import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * Default implementation of {@link ExcelObjectMapper}
 *
 * @author Yin, Jack
 * @since 1.0
 */
public class DefaultExcelObjectMapper implements ExcelObjectMapper {

    @Override
    public Workbook write(List<T> list) {
        return null;
    }

}
