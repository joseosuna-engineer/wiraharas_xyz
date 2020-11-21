# wiraharas_xyz
Spring MVC serverless portal

```java

@RestController
class Controller {

    @Autowired
    private CuentaService cuentaService;

    @Autowired
    private TitularService titularService;

    @GetMapping("/cuenta/{guid}")
    public CuentaDto getCuenta(@PathVariable String guid) {

        return cuentaService.get(guid);
    }

    @GetMapping("/titular/{guid}")
    public TitularDto getTitular(@PathVariable String guid) {

        return titularService.get(guid);
    }

}


```
