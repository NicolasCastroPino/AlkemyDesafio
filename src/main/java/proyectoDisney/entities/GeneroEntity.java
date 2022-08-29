package proyectoDisney.entities;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
* Este ítem deberá tener:
■ Nombre
■ Imagen
■ Películas o series asociadas
* */


@Entity
@Data
class GeneroEntity {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String nombre;
    private String imagen;

}
