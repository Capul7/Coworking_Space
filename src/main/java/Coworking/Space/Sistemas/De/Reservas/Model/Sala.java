package Coworking.Space.Sistemas.De.Reservas.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "sala")
public class Sala {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private int capacidad;
    private boolean estado; //disponoble o ocupada

    @OneToMany (mappedBy = "sala", cascade = CascadeType.ALL)
    private List<Reserva> reservas;
}
