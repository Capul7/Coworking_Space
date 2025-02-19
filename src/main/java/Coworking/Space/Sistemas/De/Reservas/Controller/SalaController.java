package Coworking.Space.Sistemas.De.Reservas.Controller;

import Coworking.Space.Sistemas.De.Reservas.Model.ModelSala;
import Coworking.Space.Sistemas.De.Reservas.Service.SalaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coworkingSpace/salas/")
public class SalaController {

    private final SalaService salaService;

    public SalaController(SalaService salaService) {
        this.salaService = salaService;
    }

    //Endpoint para obtener las salas
    @GetMapping(value = "listar")
    public List<ModelSala> listarSalas(){
        return salaService.listarSalas();
    }

    //Endpoint para crear la sala
    @PostMapping(value = "crear", headers = "Accept=application/json")
    public void crearSala(@RequestBody ModelSala sala) {
        salaService.crearSala(sala);
    }

    //Endpoint para obtener salas disponibles
    @GetMapping(value = "listar/disponibles")
    public List<ModelSala> listarSalasDisponibles(){
        return salaService.listarSalasDisponibles();
    }
}
