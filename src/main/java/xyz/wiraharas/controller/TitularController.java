package xyz.wiraharas.controller;

import xyz.wiraharas.entity.Titular;
import xyz.wiraharas.service.TitularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/titular")
public class TitularController {

    @Autowired
    private TitularService titularService;

    @GetMapping(path = "/{rut}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    Titular get(@PathVariable String rut) {
        return titularService.get(rut);
    }

}
