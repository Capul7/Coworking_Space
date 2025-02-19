package Coworking.Space.Sistemas.De.Reservas.Repository;

import Coworking.Space.Sistemas.De.Reservas.Model.ModelReserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReservasRepository extends JpaRepository<ModelReserva, Long> {
}