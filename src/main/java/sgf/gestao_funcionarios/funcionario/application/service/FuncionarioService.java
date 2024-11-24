package sgf.gestao_funcionarios.funcionario.application.service;

import sgf.gestao_funcionarios.funcionario.application.api.FuncionarioAlteracaoRequest;
import sgf.gestao_funcionarios.funcionario.application.api.FuncionarioListResponse;
import sgf.gestao_funcionarios.funcionario.application.api.FuncionarioRequest;
import sgf.gestao_funcionarios.funcionario.application.api.FuncionarioResponse;

import java.util.List;
import java.util.UUID;

public interface FuncionarioService {
    FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);
    List<FuncionarioListResponse> buscaTodosFuncionarios();
    void deletaFuncionarioAtravesId(UUID idFuncionario);
}
