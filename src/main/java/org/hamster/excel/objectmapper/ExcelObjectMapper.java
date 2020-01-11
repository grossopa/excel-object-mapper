package org.hamster.excel.objectmapper;

import java.util.List;

import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * The main entry of this library. user should use this class to create an
 * instance for mapping.
 *
 * @author Yin, Jack
 * @since 1.0
 */
public interface ExcelObjectMapper {
    
    Workbook write(List<T> list);

}
