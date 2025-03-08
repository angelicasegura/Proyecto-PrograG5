
package com.ecotienda.repository;

import com.ecotienda.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


public interface ProductoRepository extends JpaRepository<Producto, Long>{
    
}
