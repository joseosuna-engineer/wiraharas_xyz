package xyz.wiraharas.controller;

import java.util.List;
import xyz.wiraharas.dto.CuentaDto;
import xyz.wiraharas.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import xyz.wiraharas.dto.TitularDto;
import xyz.wiraharas.dto.UserDto;
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
    CuentaDto getCuenta(@PathVariable String guid) {

        return cuentaService.get(guid);
    }

    @GetMapping("/titular/{guid}")
    TitularDto getTitular(@PathVariable String guid) {

        return titularService.get(guid);
    }

    @GetMapping("/usuario")
    List<UserDto> listAllUsers() {

        return userService.listAll();
    }

}
