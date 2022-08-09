package boaviagem.com.br.ecc.adapter.input.web.v1.request;

import lombok.Data;

@Data
public class EsposoRequest {
    private String nome;
    private String sobreNome;
    private String email;
    private String cpf;
    private String endereco;
}
