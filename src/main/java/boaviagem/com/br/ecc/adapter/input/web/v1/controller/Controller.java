package boaviagem.com.br.ecc.adapter.input.web.v1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class Controller {

    @GetMapping("casais")
    public String getName() {
        return "deu certo";
    }
}
