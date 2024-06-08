package pe.cibertec.examen_cl1.service;

import pe.cibertec.examen_cl1.model.bd.Usuario;

import java.util.List;

public interface IUsuarioService {
    Usuario buscarUsuarioXNombreUsuario(String nomusuario);
    Usuario guardarUsuario(Usuario usuario);
    void actualizarUsuario(Usuario usuario);
    List<Usuario> listarUsuario();
    Usuario buscarUsuarioXIdUsuario(Integer idUsuario);


}
