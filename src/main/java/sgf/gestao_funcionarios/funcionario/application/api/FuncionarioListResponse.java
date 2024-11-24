package sgf.gestao_funcionarios.funcionario.application.api;

import jakarta.validation.constraints.NotBlank;

public class FuncionarioListResponse {
    private String name;
    private String designacao;
    private double salario;
    private String telefone;
    private String endereco;
}
