package xyz.wiraharas.service.impl;

import xyz.wiraharas.dto.TitularDto;
import xyz.wiraharas.service.TitularService;
import org.springframework.stereotype.Service;
import xyz.wiraharas.entity.TitularEntity;

@Service
public class TitularServiceImpl implements TitularService {

    @Override
    public TitularDto get(String guid) {

        TitularEntity titularEntity = getTitularByGuid(guid);

        TitularDto titular = new TitularDto();
        /**
         * Only the data I want to show
         */
        titular.setName(titularEntity.getName());
        titular.setLastName(titularEntity.getLastName());
        return titular;

    }

    /**
     * database search simulation
     *
     * @param guid
     * @return TitularEntity
     */
    private TitularEntity getTitularByGuid(String guid) {

        TitularEntity titularEntity = new TitularEntity();
        titularEntity.setGuid(guid);
        titularEntity.setClientId("1122E34");
        titularEntity.setName("John");
        titularEntity.setLastName("Doe");
        titularEntity.setEmail("john.doe@wiraharas.xyz");
        return titularEntity;

    }

}
