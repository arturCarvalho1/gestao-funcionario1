package sgf.gestao_funcionarios.funcionario.application.repository;

import sgf.gestao_funcionarios.funcionario.domain.Funcionario;

import java.util.List;

public interface FuncionarioRepository {
    Funcionario salva(Funcionario funcionario);
    List<Funcionario> buscaTodosFuncionarios();
}
