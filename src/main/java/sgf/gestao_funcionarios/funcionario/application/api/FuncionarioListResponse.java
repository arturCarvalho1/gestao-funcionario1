package sgf.gestao_funcionarios.funcionario.application.api;

import jakarta.validation.constraints.NotBlank;
import sgf.gestao_funcionarios.funcionario.domain.Funcionario;

import java.util.List;

public class FuncionarioListResponse {
    private String name;
    private String designacao;
    private double salario;
    private String telefone;
    private String endereco;

    public static List<FuncionarioListResponse> converte(List<Funcionario> funcionarios) {
        return null;
    }
}
