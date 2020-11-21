package xyz.wiraharas.service.impl;

import xyz.wiraharas.dto.CuentaDto;
import xyz.wiraharas.service.CuentaService;
import org.springframework.stereotype.Service;
import xyz.wiraharas.entity.CuentaEntity;

@Service
public class CuentaServiceImpl implements CuentaService {

    @Override
    public CuentaDto get(String guid) {

        CuentaEntity cuentaEntity = getCuentaByGuid(guid);

        CuentaDto cuenta = new CuentaDto();
        /**
         * Only the data I want to show
         */
        cuenta.setLastDigitsNumber(getLastDigits(cuentaEntity.getNumber()));
        return cuenta;
    }

    /**
     * database search simulation
     *
     * @param guid
     * @return CuentaEntity
     */
    private CuentaEntity getCuentaByGuid(String guid) {
        CuentaEntity cuentaEntity = new CuentaEntity();
        cuentaEntity.setGuid(guid);
        cuentaEntity.setClientId("1122E34");
        cuentaEntity.setNumber("9876543210123");
        return cuentaEntity;
    }

    private String getLastDigits(String number) {
        return "***" + number.substring(number.length() - 4);
    }

}
