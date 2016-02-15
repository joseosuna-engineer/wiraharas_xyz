/*
 * Copyright 2016 Wiraharas AG.
 */
package com.wiraharas.xyz.catatumbo.service.impl;

import com.wiraharas.xyz.catatumbo.entity.Titular;
import com.wiraharas.xyz.catatumbo.service.TitularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose Osuna (Trebol-IT)
 */
@Service
public class TitularServiceImpl implements TitularService {

    @Autowired
    private Titular titular;

    @Override
    public Titular get(String rut) {
        titular.setRut(rut);
        titular.setId(1L);
        titular.setName("Jose");
        titular.setLastName("Osuna");
        titular.setEmail("jose.osuna@wiraharas.xyz");
        return titular;
    }

}
