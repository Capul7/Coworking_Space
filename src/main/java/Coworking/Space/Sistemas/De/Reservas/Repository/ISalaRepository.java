package Coworking.Space.Sistemas.De.Reservas.Repository;

import Coworking.Space.Sistemas.De.Reservas.Model.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISalaRepository extends JpaRepository<Sala, Long> {
}
