/**
 * 
 */
package org.hamster.excel.objectmapper.type;

/**
 *
 *
 * @author Yin, Jack
 * @since 1.0
 */
public interface JavaType {

    Class<?> getRawClass();

    /**
     * Whether this type is a referential type, meaning that values are basically
     * pointers to "real" values (or null) and not regular values themselves.
     * Typical examples include things like
     * {@link java.util.concurrent.atomic.AtomicReference}, and various
     * <code>Optional</code> types (in JDK8, Guava).
     */
    public boolean isReferenceType();
    
    public boolean isContainerType();
}
