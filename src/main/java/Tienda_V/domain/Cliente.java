
package Tienda_V.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="cliente")
public class Cliente implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    
    //Para crear un ID cliente, que tiene que ser incremental, unico y no se puede repetir.
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;//hibernate lo transformna a id_cliente (cuando detecta mayusculas lo pasa a minuscula y le agrega un underscore)
    
    String nombre ;
    String apellidos ;
    String correo ;
    String telefono ;

    public Cliente() {
        
    }

    public Cliente(String nombre, String apellidos, String correo, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    
    
    
}
