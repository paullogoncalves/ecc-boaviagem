package boaviagem.com.br.ecc.application.service;

import boaviagem.com.br.ecc.adapter.output.entity.EsposoEntity;
import boaviagem.com.br.ecc.adapter.output.mysql.CadastroEsposoEsposaRepository;
import boaviagem.com.br.ecc.application.domain.Esposo;
import boaviagem.com.br.ecc.application.port.input.CadastroEsposoEsposaUserCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroEsposoService implements CadastroEsposoEsposaUserCase {

    @Autowired
    private CadastroEsposoEsposaRepository repository;

    @Override
    public void execute(Esposo esposo) {
        EsposoEntity esposoE = new EsposoEntity();
        esposoE.setNome("Paulo");
        esposoE.setSobreNome("Jesus");
        esposoE.setCpf("12365");
        esposoE.setEndereco("slslslsls");
        repository.save(esposoE);
    }
}
