package sgf.gestao_funcionarios.funcionario.infra;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sgf.gestao_funcionarios.funcionario.domain.Funcionario;

import java.util.UUID;

@Repository
public interface FuncionarioSpringDataJPARepository extends JpaRepository<Funcionario, UUID> {

}
