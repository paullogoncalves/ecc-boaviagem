package boaviagem.com.br.ecc.adapter.output.mysql;

import boaviagem.com.br.ecc.adapter.output.entity.EsposoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CadastroEsposoEsposaRepository extends JpaRepository<EsposoEntity, UUID> {
}
