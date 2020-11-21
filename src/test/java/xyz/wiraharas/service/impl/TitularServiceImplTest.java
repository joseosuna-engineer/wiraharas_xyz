package xyz.wiraharas.service.impl;

import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.wiraharas.dto.TitularDto;

@SpringBootTest
class TitularServiceImplTest {

    @Autowired
    private TitularServiceImpl titularServiceImpl;

    @Test
    void testGet() {
        TitularDto titularDto = titularServiceImpl.get("75485457");
        assertThat(titularDto.getName(),
                is(
                        equalTo("John")
                )
        );
    }

}
