package org.hamster.excel.objectmapper.column;

import lombok.AllArgsConstructor;
import lombok.var;
import org.hamster.excel.objectmapper.model.ObjectDetails;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */
class ObjectDetailsBuilderTest {

    private ObjectDetailsBuilder testSubject;

    @BeforeEach
    public void beforeEach() {
        ColumnCandidateProvider provider = new DefaultColumnCandidateProvider();
        testSubject = new ObjectDetailsBuilder(provider);
    }

    @Test
    void from() {
        ObjectDetails obj = testSubject.from(null, TestModel2.class);
        System.out.println(obj.toString());
    }
}

@AllArgsConstructor
class TestModel2 {
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