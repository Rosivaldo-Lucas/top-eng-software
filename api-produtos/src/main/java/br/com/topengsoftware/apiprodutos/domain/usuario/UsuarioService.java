package br.com.topengsoftware.apiprodutos.domain.usuario;

import br.com.topengsoftware.apiprodutos.domain.usuario.dto.UsuarioInput;
import br.com.topengsoftware.apiprodutos.domain.usuario.dto.UsuarioOutput;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    // private final PasswordEncoder passwordEncoder;

    // public UsuarioService(final UsuarioRepository usuarioRepository, final PasswordEncoder passwordEncoder) {
    public UsuarioService(final UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
        // this.passwordEncoder = passwordEncoder;
    }

    public UsuarioOutput criar(final UsuarioInput usuarioInput) {
        //  final String password = this.passwordEncoder.encode(usuarioInput.password());

        final Usuario novoUsuario = Usuario.criar(
                usuarioInput.nome(),
                usuarioInput.username(),
                String.valueOf(123)
        );

        final UsuarioEntity usuarioPersistido = this.usuarioRepository.save(novoUsuario.toUsuarioEntity());

        return UsuarioOutput.criar(
                usuarioPersistido.getId(),
                usuarioPersistido.getNome(),
                usuarioPersistido.getUsername(),
                usuarioPersistido.getDataCriacao()
        );
    }

}
