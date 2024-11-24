package sgf.gestao_funcionarios.funcionario.infra;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import sgf.gestao_funcionarios.funcionario.application.repository.FuncionarioRepository;
import sgf.gestao_funcionarios.funcionario.domain.Funcionario;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class FuncionarioIfraRepository implements FuncionarioRepository {
    private final FuncionarioSpringDataJPARepository funcionarioSpringDataJPARepository;

    @Override
    public Funcionario salva(Funcionario funcionario){
        log.info("[inicia] FuncionarioIfraRepository - salva");
        funcionarioSpringDataJPARepository.save(funcionario);
        log.info("[finaliza] FuncionarioIfraRepository - salva");
        return funcionario;
    }

    @Override
    public List<Funcionario> buscaTodosFuncionarios() {
        log.info("[inicia] FuncionarioIfraRepository - buscaTodosFuncionarios");
        List<Funcionario> todosFuncinarios = funcionarioSpringDataJPARepository.findAll();
        log.info("[finaliza] FuncionarioIfraRepository - buscaTodosFuncionarios");
        return todosFuncinarios;
    }

    @Override
    public void deletaFuncionarioAtravesId(UUID idFuncionario) {
        log.info("[inicia] FuncionarioIfraRepository - deletaFuncionarioAtravesId");
        log.info("[finaliza] FuncionarioIfraRepository - deletaFuncionarioAtravesId");

    }
}
