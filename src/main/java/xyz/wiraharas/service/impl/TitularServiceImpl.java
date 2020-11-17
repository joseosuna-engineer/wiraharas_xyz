package xyz.wiraharas.service.impl;

import xyz.wiraharas.entity.Titular;
import xyz.wiraharas.service.TitularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TitularServiceImpl implements TitularService {

    @Autowired
    private Titular titular;

    @Override
    public Titular get(String guid) {
        titular.setRut("40k");
        titular.setId(1L);
        titular.setName("John");
        titular.setLastName("Doe");
        titular.setEmail("john.doe@wiraharas.xyz");
        return titular;
    }

}
