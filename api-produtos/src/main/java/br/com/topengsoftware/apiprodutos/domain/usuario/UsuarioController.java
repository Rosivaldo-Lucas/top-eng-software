package br.com.topengsoftware.apiprodutos.domain.usuario;

import br.com.topengsoftware.apiprodutos.domain.usuario.dto.CriarUsuarioDTO;
import br.com.topengsoftware.apiprodutos.domain.usuario.dto.UsuarioDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(final UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @Operation(summary = "Criar usuario")
    @ApiResponse(description = "Novo usuario criado", responseCode = "201")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<UsuarioDTO> criar(final @RequestBody CriarUsuarioDTO criarUsuarioDTO) {
        final UsuarioDTO usuarioCriado = this.usuarioService.criar(criarUsuarioDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioCriado);
    }

}
