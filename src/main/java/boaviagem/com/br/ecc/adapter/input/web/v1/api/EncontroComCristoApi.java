package boaviagem.com.br.ecc.adapter.input.web.v1.api;


import boaviagem.com.br.ecc.adapter.input.web.v1.request.EsposoRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/v1/casais")
public interface EncontroComCristoApi {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/esposos")
    void criarCadastroEsposo(@RequestBody EsposoRequest esposoRequest);
}
