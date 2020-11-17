/*
 * Copyright 2016 Wiraharas AG.
 */
package com.wiraharas.xyz.catatumbo.service.impl;

import com.wiraharas.xyz.catatumbo.entity.Cuenta;
import com.wiraharas.xyz.catatumbo.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose Osuna (Trebol-IT)
 */
@Service
public class CuentaServiceImpl implements CuentaService {

    @Autowired
    private Cuenta cuenta;

    @Override
    public Cuenta get(String rut) {
        cuenta.setNumber("0102-12-1452-6541752415");
        cuenta.setRut(rut);
        return cuenta;
    }

}
