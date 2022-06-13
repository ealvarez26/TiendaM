
package Tienda_V.dao;
//DAO STANDS FOR DATA ACCES OBJECT

import Tienda_V.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Long> {
    
    
    
    
}
