package Coworking.Space.Sistemas.De.Reservas.Repository;

import Coworking.Space.Sistemas.De.Reservas.Model.ModelSala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISalaRepository extends JpaRepository<ModelSala, Long> {
    List<ModelSala> findByEstadoTrue();
}
