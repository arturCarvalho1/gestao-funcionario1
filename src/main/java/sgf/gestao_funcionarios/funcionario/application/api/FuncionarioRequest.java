package sgf.gestao_funcionarios.funcionario.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class FuncionarioRequest {
    @NotBlank
    private String name;
    private String designacao;
    private double salario;
    @NotBlank
    private String telefone;
    private String endereco;
}
