package Coworking.Space.Sistemas.De.Reservas.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "reserva")
public class ModelReserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private ModelUsuario modelUsuario;

    @ManyToOne
    @JoinColumn(name = "sala_id")
    private ModelSala modelSala;

    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;
}

