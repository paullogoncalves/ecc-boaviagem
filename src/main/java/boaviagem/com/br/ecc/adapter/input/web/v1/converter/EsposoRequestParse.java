package boaviagem.com.br.ecc.adapter.input.web.v1.converter;

import boaviagem.com.br.ecc.adapter.input.web.v1.request.EsposoRequest;
import boaviagem.com.br.ecc.application.domain.Esposo;
import org.springframework.stereotype.Component;

@Component
public class EsposoRequestParse {
    public Esposo parse(EsposoRequest esposoRequest) {
        Esposo esposo = new Esposo();
        esposo.setNome(esposoRequest.getNome());
        esposo.setSobreNome(esposoRequest.getSobreNome());
        esposo.setEmail(esposoRequest.getEmail());
        esposo.setCpf(esposoRequest.getCpf());
        esposo.setEndereco(esposoRequest.getEndereco());
        return esposo;
    }
}
