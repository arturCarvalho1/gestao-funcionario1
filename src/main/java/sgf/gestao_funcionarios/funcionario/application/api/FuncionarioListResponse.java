package sgf.gestao_funcionarios.funcionario.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;
import sgf.gestao_funcionarios.funcionario.domain.Funcionario;

import java.util.List;
import java.util.stream.Collectors;

@Value
public class FuncionarioListResponse {
    private String name;
    private String designacao;
    private double salario;
    private String telefone;
    private String endereco;

    public static List<FuncionarioListResponse> converte(List<Funcionario> funcionarios) {
        return funcionarios.stream()
                .map(FuncionarioListResponse::new)
                .collect(Collectors.toList());

    }

    public FuncionarioListResponse(Funcionario funcionario) {
        this.designacao = funcionario.getDesignacao();
        this.endereco = funcionario.getEndereco();
        this.name = funcionario.getName();
        this.salario = funcionario.getSalario();
        this.telefone = funcionario.getTelefone();
    }
}

