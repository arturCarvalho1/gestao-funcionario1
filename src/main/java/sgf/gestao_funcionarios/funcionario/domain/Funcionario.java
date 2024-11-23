package sgf.gestao_funcionarios.funcionario.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idFuncionario;
    @NotBlank
    private String name;
    private String designacao;
    private double salario;
    @NotBlank
    private String telefone;
    private String endereco;

    public Funcionario(String designacao, String endereco, UUID idFuncionario, String name, double salario, String telefone) {
        this.designacao = designacao;
        this.endereco = endereco;
        this.idFuncionario = UUID.randomUUID();
        this.name = name;
        this.salario = salario;
        this.telefone = telefone;
    }
}