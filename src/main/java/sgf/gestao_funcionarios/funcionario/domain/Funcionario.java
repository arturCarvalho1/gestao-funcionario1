package sgf.gestao_funcionarios.funcionario.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import sgf.gestao_funcionarios.funcionario.application.api.FuncionarioAlteracaoRequest;
import sgf.gestao_funcionarios.funcionario.application.api.FuncionarioRequest;

import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idCliente", updatable = false, unique = true, nullable = false)
    private UUID idFuncionario;
    @NotBlank
    private String name;
    private String designacao;
    private double salario;
    @NotBlank
    private String telefone;
    private String endereco;

    public Funcionario(FuncionarioRequest funcionarioRequest) {
        this.designacao = funcionarioRequest.getDesignacao();
        this.endereco = funcionarioRequest.getEndereco();
        this.name = funcionarioRequest.getName();
        this.salario = funcionarioRequest.getSalario();
        this.telefone = funcionarioRequest.getTelefone();
    }

    public void altera(FuncionarioAlteracaoRequest funcionarioRequest) {
        this.designacao = funcionarioRequest.getDesignacao();
        this.endereco = funcionarioRequest.getEndereco();
        this.name = funcionarioRequest.getName();
        this.salario = funcionarioRequest.getSalario();
        this.telefone = funcionarioRequest.getTelefone();

    }
}