package proyectoDisney.entities;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "pelicula")
public class PeliculaEntity {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String imagen;
    private String titulo;
    private Integer rating;

    @DateTimeFormat(pattern = "yyyy/mm/dd")
    @Column(name="fecha_creacion")
    private LocalDate fecha;

    @ManyToMany(mappedBy = "listadoPelicula", cascade = CascadeType.ALL)
    private Set<PersonajeEntity> listadoPersonaje = new HashSet<>();

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "genero_id", insertable = false, updatable = false)
    private GeneroEntity genero;

    @Column(name = "genero_id", nullable = false)
    private String generoid;


}
