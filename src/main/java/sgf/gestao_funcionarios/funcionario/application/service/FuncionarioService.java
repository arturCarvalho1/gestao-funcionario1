package sgf.gestao_funcionarios.funcionario.application.service;

import sgf.gestao_funcionarios.funcionario.application.api.FuncionarioRequest;
import sgf.gestao_funcionarios.funcionario.application.api.FuncionarioResponse;

public interface FuncionarioService {
    FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);
}
