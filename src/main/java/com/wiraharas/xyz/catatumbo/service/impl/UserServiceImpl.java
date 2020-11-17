/*
 * Copyright 2016 Wiraharas AG.
 */
package com.wiraharas.xyz.catatumbo.service.impl;

import com.wiraharas.xyz.catatumbo.entity.User;
import com.wiraharas.xyz.catatumbo.service.UserService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose Osuna (Trebol-IT)
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> listAll() {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setId(1L);
        user.setName("Jose");
        user.setLastName("Osuna");
        user.setEmail("jose.osuna@wiraharas.xyz");
        users.add(user);
        return users;
    }

}
