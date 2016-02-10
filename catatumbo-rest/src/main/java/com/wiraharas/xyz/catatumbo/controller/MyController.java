/*
 * Copyright 2016 Wiraharas AG.
 */
package com.wiraharas.xyz.catatumbo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jose Osuna (Trebol-IT)
 */
@RestController
@RequestMapping("/my-controller")
public class MyController {

    @RequestMapping(method = RequestMethod.GET)
    public String getName() {
        return "Jose Osuna";
    }

}
