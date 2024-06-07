package pe.cibertec.examen_cl1.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.cibertec.examen_cl1.model.bd.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Usuario findByNomusuario(String nomusuario);
    @Transactional
    @Modifying
    @Query(value = "UPDATE usuario SET nombres=: nombres, apellidos=:apellidos, " +
            "activo=:activo where idusuario=:idusuario")
    void  actualizarUsuario(@Param("nombres")String nombres,
                            @Param("apellidos")String apellidos,
                            @Param("activo")Boolean activo,
                            @Param("idusuario") Integer idusuario);
}
