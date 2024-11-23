package sgf.gestao_funcionarios.funcionario.infra;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;
import sgf.gestao_funcionarios.funcionario.application.repository.FuncionarioRepository;
import sgf.gestao_funcionarios.funcionario.domain.Funcionario;

@Repository
@Log4j2
public class FuncionarioIfraRepository implements FuncionarioRepository {

    @Override
    public Funcionario salva(Funcionario funcionario){
        log.info("[inicia] FuncionarioIfraRepository - salva ");
        funcionarioSpringDataJPARepository.save(funcionario);
        log.info("[finaliza] FuncionarioIfraRepository - salva ");
        return funcionario;
    }
}
