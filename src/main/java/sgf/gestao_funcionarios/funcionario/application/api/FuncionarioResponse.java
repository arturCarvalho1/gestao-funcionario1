package sgf.gestao_funcionarios.funcionario.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class FuncionarioResponse {
    private UUID idFuncionario;
}
