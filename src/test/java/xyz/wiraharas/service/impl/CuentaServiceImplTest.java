package xyz.wiraharas.service.impl;

import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.wiraharas.dto.CuentaDto;

@SpringBootTest
class CuentaServiceImplTest {

    @Autowired
    private CuentaServiceImpl cuentaServiceImpl;

    @Test
    void testGet() {
        CuentaDto cuentaDto = cuentaServiceImpl.get("75485457");
        assertThat(cuentaDto.getLastDigitsNumber(),
                is(
                        equalTo("***0123")
                )
        );
    }

}
