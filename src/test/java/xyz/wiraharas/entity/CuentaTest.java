package xyz.wiraharas.entity;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CuentaTest {

    @Test
    void testMock() {
        Boolean myResult = Boolean.TRUE;
        assertThat(myResult,
                is(
                        true
                ));
    }

}
