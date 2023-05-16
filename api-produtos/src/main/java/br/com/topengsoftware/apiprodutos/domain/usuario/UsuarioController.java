package br.com.topengsoftware.apiprodutos.domain.usuario;

import br.com.topengsoftware.apiprodutos.domain.usuario.dto.UsuarioInput;
import br.com.topengsoftware.apiprodutos.domain.usuario.dto.UsuarioOutput;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(final UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<UsuarioOutput> criar(final @RequestBody UsuarioInput usuarioInput) {
        final UsuarioOutput usuarioCriado = this.usuarioService.criar(usuarioInput);

        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioCriado);
    }

}
