package xyz.wiraharas.controller;

import xyz.wiraharas.entity.User;
import xyz.wiraharas.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/",
            produces = MediaType.APPLICATION_JSON_VALUE)
    List<User> listAllUsers() {

        return userService.listAll();
    }

}
