package sgf.gestao_funcionarios.funcionario.application.repository;

import sgf.gestao_funcionarios.funcionario.domain.Funcionario;

public interface FuncionarioRepository {
    Funcionario salva(Funcionario funcionario);
}
