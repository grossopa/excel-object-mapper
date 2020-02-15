/**
 * 
 */
package org.hamster.excel.objectmapper;

import java.util.List;

import org.hamster.excel.objectmapper.type.converter.CellValueConverter;

/**
 * Configuration for {@link ExcelObjectMapper}
 *
 * @author Yin, Jack
 * @since 1.0
 */
public class ExcelObjectMapperConfig {

    private List<CellValueConverter<?, ?>> cellValueConverters;

    public static final ExcelObjectMapperConfig buildDefault() {
        ExcelObjectMapperConfig config = new ExcelObjectMapperConfig();
    }
}
