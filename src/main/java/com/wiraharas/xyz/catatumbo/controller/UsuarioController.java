/*
 * Copyright 2016 Wiraharas AG.
 */
package com.wiraharas.xyz.catatumbo.controller;

import com.wiraharas.xyz.catatumbo.entity.User;
import com.wiraharas.xyz.catatumbo.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jose Osuna (Trebol-IT)
 */
@RestController
public class UsuarioController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<User> listAllUsers() {
        return userService.listAll();
    }

}
