package xyz.wiraharas.service.impl;

import xyz.wiraharas.dto.TitularDto;
import xyz.wiraharas.service.TitularService;
import org.springframework.stereotype.Service;

@Service
public class TitularServiceImpl implements TitularService {

    @Override
    public TitularDto get(String guid) {
        TitularDto titular = new TitularDto();
        titular.setRut("40k");
        titular.setName("John");
        titular.setLastName("Doe");
        titular.setEmail("john.doe@wiraharas.xyz");
        return titular;
    }

}
