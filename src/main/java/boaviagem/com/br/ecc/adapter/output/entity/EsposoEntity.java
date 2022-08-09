package boaviagem.com.br.ecc.adapter.output.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name ="esposo")
@Data
public class EsposoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;
    private String sobreNome;
    private String email;
    private String cpf;
    private String endereco;
}
