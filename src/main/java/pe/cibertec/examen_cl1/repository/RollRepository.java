package pe.cibertec.examen_cl1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.cibertec.examen_cl1.model.bd.Rol;

@Repository
public interface RollRepository extends JpaRepository<Rol, Integer> {
Rol findByNomrol(String nomrol);
}
