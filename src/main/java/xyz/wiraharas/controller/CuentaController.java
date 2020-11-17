package xyz.wiraharas.controller;

import xyz.wiraharas.entity.Cuenta;
import xyz.wiraharas.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cuenta")
class CuentaController {

    @Autowired
    private CuentaService cuentaService;

    @GetMapping(path = "/{rut}",
            produces = MediaType.APPLICATION_JSON_VALUE)
     Cuenta get(@PathVariable String rut) {
        return cuentaService.get(rut);
    }

}
