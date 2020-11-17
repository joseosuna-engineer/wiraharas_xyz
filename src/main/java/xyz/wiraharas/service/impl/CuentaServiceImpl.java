package xyz.wiraharas.service.impl;

import xyz.wiraharas.entity.Cuenta;
import xyz.wiraharas.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CuentaServiceImpl implements CuentaService {

    @Autowired
    private Cuenta cuenta;

    @Override
    public Cuenta get(String guid) {
        cuenta.setNumber("34445");
        cuenta.setRut(guid);
        return cuenta;
    }

}
