package Coworking.Space.Sistemas.De.Reservas.Service;

import Coworking.Space.Sistemas.De.Reservas.Model.ModelSala;
import Coworking.Space.Sistemas.De.Reservas.Repository.ISalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaService {
    private ISalaRepository salaRepository;

    @Autowired
    public SalaService(ISalaRepository salaRepository) {
        this.salaRepository = salaRepository;
    }

    //metodo para listar todas las salas
    public List<ModelSala> listarSalas() {
        return salaRepository.findAll();
    }

    //Metodo Crear Sala
    public void crearSala(ModelSala sala) {
        salaRepository.save(sala);
    }

    //Metodo para listar las salas disponibles
    public List<ModelSala> listarSalasDisponibles() {
        return salaRepository.findByEstadoTrue();
    }
}
