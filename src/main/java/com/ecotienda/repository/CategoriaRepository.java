
package com.ecotienda.repository;

import com.ecotienda.domain.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    
}
