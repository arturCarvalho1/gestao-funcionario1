package sgf.gestao_funcionarios.funcionario.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class FuncionarioAlteracaoRequest {
    @NotBlank(message = "O nome não pode estar vazio.")
    private String name;
    private String designacao;
    private double salario;
    @NotBlank(message = "O telefone não pode estar vazio.")
    private String telefone;
    private String endereco;
}
