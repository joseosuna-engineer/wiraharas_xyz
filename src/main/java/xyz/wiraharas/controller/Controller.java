package xyz.wiraharas.controller;

import xyz.wiraharas.dto.CuentaDto;
import xyz.wiraharas.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import xyz.wiraharas.dto.TitularDto;
import xyz.wiraharas.service.TitularService;

@RestController
class Controller {

    @Autowired
    private CuentaService cuentaService;

    @Autowired
    private TitularService titularService;

    @GetMapping("/cuenta/{guid}")
    public CuentaDto getCuenta(@PathVariable String guid) {

        return cuentaService.get(guid);
    }

    @GetMapping("/titular/{guid}")
    public TitularDto getTitular(@PathVariable String guid) {

        return titularService.get(guid);
    }

}
