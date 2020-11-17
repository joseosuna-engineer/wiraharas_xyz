package com.wiraharas.xyz.catatumbo.controller;

import com.wiraharas.xyz.catatumbo.entity.Cuenta;
import com.wiraharas.xyz.catatumbo.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CuentaController {

    @Autowired
    private CuentaService cuentaService;

    @RequestMapping(path = "/{rut}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Cuenta get(@PathVariable String rut) {
        return cuentaService.get(rut);
    }

}
