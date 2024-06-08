package pe.cibertec.examen_cl1.service;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pe.cibertec.examen_cl1.model.bd.Rol;
import pe.cibertec.examen_cl1.model.bd.Usuario;
import pe.cibertec.examen_cl1.repository.RollRepository;
import pe.cibertec.examen_cl1.repository.UsuarioRepository;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Service
@AllArgsConstructor
public class UsuarioService implements IUsuarioService{

    private UsuarioRepository usuarioRepository;
    private RollRepository rollRepository;
    @Override
    public Usuario buscarUsuarioXNombreUsuario(String nomusuario) {
        return usuarioRepository.findByNomusuario(nomusuario);
    }
    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        usuario.setActivo(true);
        Rol usuarioRol = rollRepository.findByNomrol("ADMIN");
        usuario.setRoles(new HashSet<>(Arrays.asList(usuarioRol)));
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        return usuarioRepository.save(usuario);
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
        usuarioRepository.actualizarUsuario(
                usuario.getNombres(),usuario.getApellidos(),
                usuario.getActivo(),usuario.getIdusuario()
        );

    }

    @Override
    public List<Usuario> listarUsuario() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario buscarUsuarioXIdUsuario(Integer idUsuario) {
        return usuarioRepository.findById(idUsuario).orElse(null);
    }
}
