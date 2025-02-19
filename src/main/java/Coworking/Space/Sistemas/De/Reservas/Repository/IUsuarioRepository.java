package Coworking.Space.Sistemas.De.Reservas.Repository;

import Coworking.Space.Sistemas.De.Reservas.Model.ModelUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<ModelUsuario, Long >{
}
