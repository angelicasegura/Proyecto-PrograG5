
package com.ecotienda.repository;


import com.ecotienda.domain.masVendidos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


public interface masVendidosRepository extends JpaRepository<masVendidos, Long>{
    
}
