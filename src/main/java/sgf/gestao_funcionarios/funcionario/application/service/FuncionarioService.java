package sgf.gestao_funcionarios.funcionario.application.service;

import sgf.gestao_funcionarios.funcionario.application.api.*;

import java.util.List;
import java.util.UUID;

public interface FuncionarioService {
    FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);
    List<FuncionarioListResponse> buscaTodosFuncionarios();
    FuncionarioDetalhadoResponse buscaFuncionarioAtravesId(UUID idFuncionario);
    void deletaFuncionarioAtravesId(UUID idFuncionario);
    void patchAlteraFuncionario(UUID idFuncionario, FuncionarioAlteracaoRequest funcionarioAlteracaoRequest);
}
