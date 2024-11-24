package sgf.gestao_funcionarios.funcionario.application.repository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import sgf.gestao_funcionarios.funcionario.application.api.FuncionarioDetalhadoResponse;
import sgf.gestao_funcionarios.funcionario.application.api.FuncionarioListResponse;
import sgf.gestao_funcionarios.funcionario.application.api.FuncionarioRequest;
import sgf.gestao_funcionarios.funcionario.application.api.FuncionarioResponse;
import sgf.gestao_funcionarios.funcionario.application.repository.FuncionarioRepository;
import sgf.gestao_funcionarios.funcionario.application.service.FuncionarioService;
import sgf.gestao_funcionarios.funcionario.domain.Funcionario;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class FuncionarioApplicationService implements FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;

    @Override
    public FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest){
        log.info("[inicia] FuncionarioApplicationService - criaFuncionario");
        Funcionario funcionario = funcionarioRepository.salva(new Funcionario(funcionarioRequest));
        log.info("[finaliza] FuncionarioApplicationService - criaFuncionario");
        return FuncionarioResponse.builder()
                .idFuncionario(funcionario.getIdFuncionario())
                .build();
    }

    @Override
    public List<FuncionarioListResponse> buscaTodosFuncionarios() {
        log.info("[inicia] FuncionarioController - buscaTodosFuncionarios");
        List<Funcionario> funcionarios = funcionarioRepository.buscaTodosFuncionarios();
        log.info("[finaliza] FuncionarioController - buscaTodosFuncionarios");
        return FuncionarioListResponse.converte(funcionarios);
    }

    @Override
    public FuncionarioDetalhadoResponse buscaFuncionarioAtravesId(UUID idFuncionario) {
        log.info("[inicia] FuncionarioController - buscaFuncionarioAtravesId");
        log.info("[finaliza] FuncionarioController - buscaFuncionarioAtravesId");
        return null;
    }

}
