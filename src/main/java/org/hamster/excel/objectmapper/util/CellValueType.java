/**
 * 
 */
package org.hamster.excel.objectmapper.util;

import java.util.Date;

import org.apache.poi.ss.usermodel.CellType;

/**
 * Defines the Java Object types which could be handled and stored into a cell.
 * Note that {@link CellType#FORMULA} is the one we cannot handle.
 *
 * @see org.apache.poi.ss.usermodel.CellType
 * @author Yin, Jack
 * @since 1.0
 */
public enum CellValueType {

    /**
     * Number Types
     */
    NUMERIC {
        @Override
        public <T, R> R apply(Func<T, R> func, T input) {
            return func.applyNumeric(input);
        }

        @Override
        public Class<?> getValueType() {
            return Double.class;
        }
    },

    /**
     * There is no actual integer value though we can set the style to make a
     * numeric value as integer.
     * 
     */
    INTEGER {

        @Override
        public <T, R> R apply(Func<T, R> func, T input) {
            return func.applyInteger(input);
        }

        @Override
        public Class<?> getValueType() {
            return Integer.class;
        }

    },

    /**
     * Date types, note that in Excel it is treated as numeric without time-zone
     * information.
     */
    DATE {
        @Override
        public <T, R> R apply(Func<T, R> func, T input) {
            return func.applyDate(input);
        }

        @Override
        public Class<?> getValueType() {
            return Date.class;
        }
    },

    /**
     * String type
     */
    STRING {
        @Override
        public <T, R> R apply(Func<T, R> func, T input) {
            return func.applyString(input);
        }

        @Override
        public Class<?> getValueType() {
            return String.class;
        }
    },

    /**
     * boolean type
     */
    BOOLEAN {
        @Override
        public <T, R> R apply(Func<T, R> func, T input) {
            return func.applyBoolean(input);
        }

        @Override
        public Class<?> getValueType() {
            return Boolean.class;
        }
    },

    /**
     * For values with null or empty
     */
    BLANK {
        @Override
        public <T, R> R apply(Func<T, R> func, T input) {
            return func.applyBlank(input);
        }

        @Override
        public Class<?> getValueType() {
            return Void.class;
        }
    },

    /**
     * If invokes the getter or tries to get the field value failed the cell will be
     * marked as ERROR in SAFE mode.
     */
    ERROR {
        @Override
        public <T, R> R apply(Func<T, R> func, T input) {
            return func.applyError(input);
        }

        @Override
        public Class<?> getValueType() {
            return String.class;
        }
    };

    public abstract <T, R> R apply(Func<T, R> func, T input);

    /**
     * Gets the target value type
     * 
     * @return
     */
    public abstract Class<?> getValueType();

    public static interface Func<T, R> {

        R applyNumeric(T input);

        R applyInteger(T input);

        R applyDate(T input);

        R applyString(T input);

        R applyBoolean(T input);

        R applyBlank(T input);

        R applyError(T input);
    }

    public static interface BiFunc<T, U, R> {
        R applyNumeric(T input1, U input2);

        R applyInteger(T input1, U input2);

        R applyDate(T input1, U input2);

        R applyString(T input1, U input2);

        R applyBoolean(T input1, U input2);

        R applyBlank(T input1, U input2);

        R applyError(T input1, U input2);
    }

}
