package br.com.topengsoftware.apiprodutos.domain.usuario;

import br.com.topengsoftware.apiprodutos.domain.usuario.dto.CriarUsuarioDTO;
import br.com.topengsoftware.apiprodutos.domain.usuario.dto.UsuarioDTO;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public UsuarioService(final UsuarioRepository usuarioRepository, final PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public UsuarioDTO criar(final CriarUsuarioDTO criarUsuarioDTO) {
        final String password = this.passwordEncoder.encode(criarUsuarioDTO.password());

        final Usuario novoUsuario = Usuario.criar(
                criarUsuarioDTO.nome(),
                criarUsuarioDTO.username(),
                String.valueOf(123)
        );

        final UsuarioEntity usuarioPersistido = this.usuarioRepository.save(novoUsuario.toUsuarioEntity());

        return UsuarioDTO.criar(
                usuarioPersistido.getId(),
                usuarioPersistido.getNome(),
                usuarioPersistido.getUsername(),
                usuarioPersistido.getDataCriacao()
        );
    }

}
