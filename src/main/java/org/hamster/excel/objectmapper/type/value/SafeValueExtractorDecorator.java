/**
 * 
 */
package org.hamster.excel.objectmapper.type.value;

import static java.util.Objects.requireNonNull;

import java.util.Optional;

import lombok.extern.slf4j.Slf4j;

/**
 * Safely extracts the value from the given {@link ValueExtractor}
 *
 * @author Yin, Jack
 * @since 1.0
 */
@Slf4j
public class SafeValueExtractorDecorator<T> implements ValueExtractor<T> {

    private final ValueExtractor<T> valueExtractor;

    public SafeValueExtractorDecorator(ValueExtractor<T> valueExtractor) {
        requireNonNull(valueExtractor);
        this.valueExtractor = valueExtractor;
    }

    @Override
    public Optional<Object> extract(Object targetObject) {
        try {
            return Optional.ofNullable(valueExtractor.extract(targetObject));
        } catch (Exception e) {
            log.debug("get value from targetObject {} failed with {}, return empty result instead.", targetObject,
                    valueExtractor.getSource());
            return Optional.empty();
        }
    }

    public T getSource() {
        return valueExtractor.getSource();
    }

}
