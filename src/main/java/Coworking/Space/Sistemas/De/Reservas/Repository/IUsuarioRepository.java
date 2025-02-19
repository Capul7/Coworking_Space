package Coworking.Space.Sistemas.De.Reservas.Repository;

import Coworking.Space.Sistemas.De.Reservas.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Long >{
}
