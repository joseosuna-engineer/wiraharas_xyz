package com.wiraharas.xyz.catatumbo.service.impl;

import com.wiraharas.xyz.catatumbo.entity.Titular;
import com.wiraharas.xyz.catatumbo.service.TitularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TitularServiceImpl implements TitularService {

    @Autowired
    private Titular titular;

    @Override
    public Titular get(String rut) {
        titular.setRut(rut);
        titular.setId(1L);
        titular.setName("John");
        titular.setLastName("Doe");
        titular.setEmail("john.doe@wiraharas.xyz");
        return titular;
    }

}
