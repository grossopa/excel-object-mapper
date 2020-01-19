/**
 * 
 */
package org.hamster.excel.objectmapper.column;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.hamster.excel.objectmapper.model.ColumnCandidate;
import org.junit.jupiter.api.Test;

import lombok.AllArgsConstructor;

/**
 * Tests for {@link DefaultColumnCandidateProvider}
 *
 * @author Yin, Jack
 * @since 1.0
 */
public class DefaultColumnCandidateProviderTest {

    DefaultColumnCandidateProvider testSubject = new DefaultColumnCandidateProvider();

    /**
     * Test method for
     * {@link org.hamster.excel.objectmapper.column.DefaultColumnCandidateProvider#supplyFrom(java.lang.Class)}.
     */
    @Test
    public void testSupplyFrom() throws Exception {
        List<ColumnCandidate> candidates = testSubject.supplyFrom(TestModel.class);

        assertEquals(4, candidates.size());
        assertTrue(candidates.stream().anyMatch(c -> "field1".equals(c.getName())));
        assertTrue(candidates.stream().anyMatch(c -> "fff2".equals(c.getName())));
        assertTrue(candidates.stream().anyMatch(c -> "filedApple333".equals(c.getName())));
        assertTrue(candidates.stream().anyMatch(c -> "someGetter".equals(c.getName())));
    }

}

@AllArgsConstructor
class TestModel {
    private Long field1;
    private String fff2;
    @SuppressWarnings("unused")
    private Integer filedApple333;

    public String getSomeGetter() {
        return fff2 + " " + field1;
    }

    public String getSomeOtherMethod(int abew) {
        return "333";
    }

}