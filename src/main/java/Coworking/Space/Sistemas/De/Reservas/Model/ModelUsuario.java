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
@Table(name = "usuarios")
public class ModelUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String correo;
    private String contrasena;

    @OneToMany(mappedBy = "modelUsuario", cascade = CascadeType.ALL)
    private List<ModelReserva> modelReservas;
}
