package xyz.wiraharas.service.impl;

import xyz.wiraharas.dto.CuentaDto;
import xyz.wiraharas.service.CuentaService;
import org.springframework.stereotype.Service;

@Service
public class CuentaServiceImpl implements CuentaService {

    @Override
    public CuentaDto get(String guid) {
        CuentaDto cuenta = new CuentaDto();
        cuenta.setNumber("34445");
        cuenta.setRut(guid);
        return cuenta;
    }

}
