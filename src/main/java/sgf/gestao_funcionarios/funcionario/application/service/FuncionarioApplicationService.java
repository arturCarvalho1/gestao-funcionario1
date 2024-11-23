package sgf.gestao_funcionarios.funcionario.application.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import sgf.gestao_funcionarios.funcionario.application.api.FuncionarioRequest;
import sgf.gestao_funcionarios.funcionario.application.api.FuncionarioResponse;

@Service
@Log4j2
public class FuncionarioApplicationService implements FuncionarioService{

    @Override
    public FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest){
       log.info("[inicia] FuncionarioApplicationService - criaFuncionario");
       log.info("[finaliza] FuncionarioApplicationService - criaFuncionario");
        return null;
    }
}
