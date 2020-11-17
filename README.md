# wiraharas_xyz
Spring MVC serverless portal

```java

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

```

```java

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

```

```java

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

```
