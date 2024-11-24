package sgf.gestao_funcionarios.funcionario.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;
import sgf.gestao_funcionarios.funcionario.domain.Funcionario;

import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class FuncionarioDetalhadoResponse {
    private String name;
    private String designacao;
    private double salario;
    private String telefone;
    private String endereco;

    public FuncionarioDetalhadoResponse(Funcionario funcionario) {
        this.designacao = funcionario.getDesignacao();
        this.endereco = funcionario.getEndereco();
        this.name = funcionario.getName();
        this.salario = funcionario.getSalario();
        this.telefone = funcionario.getTelefone();
    }
}
