package boaviagem.com.br.ecc.adapter.input.web.v1.controller;

import boaviagem.com.br.ecc.adapter.input.web.v1.api.EncontroComCristoApi;
import boaviagem.com.br.ecc.adapter.input.web.v1.converter.EsposoRequestParse;
import boaviagem.com.br.ecc.adapter.input.web.v1.request.EsposoRequest;
import boaviagem.com.br.ecc.application.port.input.CadastroEsposoEsposaUserCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EncontroController implements EncontroComCristoApi {

    @Autowired
    private CadastroEsposoEsposaUserCase esposoEsposaUserCase;

    @Autowired
    private EsposoRequestParse esposoRequestParse;

    @Override
    public void criarCadastroEsposo(EsposoRequest esposoRequest) {
        esposoEsposaUserCase.execute(esposoRequestParse.parse(esposoRequest));
    }
}
