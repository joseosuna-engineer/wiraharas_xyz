package xyz.wiraharas.controller;

import java.util.List;
import xyz.wiraharas.entity.Cuenta;
import xyz.wiraharas.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import xyz.wiraharas.entity.Titular;
import xyz.wiraharas.entity.User;
import xyz.wiraharas.service.TitularService;
import xyz.wiraharas.service.UserService;

@RestController
class Controller {

    @Autowired
    private CuentaService cuentaService;

    @Autowired
    private TitularService titularService;

    @Autowired
    private UserService userService;

    @GetMapping("/cuenta/{guid}")
    Cuenta getCuenta(@PathVariable String guid) {

        return cuentaService.get(guid);
    }

    @GetMapping("/titular/{guid}")
    Titular getTitular(@PathVariable String guid) {

        return titularService.get(guid);
    }

    @GetMapping("/usuario")
    List<User> listAllUsers() {

        return userService.listAll();
    }

}
