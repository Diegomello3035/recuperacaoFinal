package recuperacaoFinal.dm.Repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import recuperacaoFinal.dm.Entity.Cliente;


public interface RepositoryCliente  extends JpaRepository<Cliente,Long> {
}
