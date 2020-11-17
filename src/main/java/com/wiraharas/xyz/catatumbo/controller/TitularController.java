/*
 * Copyright 2016 Wiraharas AG.
 */
package com.wiraharas.xyz.catatumbo.controller;

import com.wiraharas.xyz.catatumbo.entity.Titular;
import com.wiraharas.xyz.catatumbo.service.TitularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jose Osuna (Trebol-IT)
 */
@RestController
public class TitularController {

    @Autowired
    private TitularService titularService;

    @RequestMapping(path = "/{rut}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Titular get(@PathVariable String rut) {
        return titularService.get(rut);
    }

}
