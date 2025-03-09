
package com.ecotienda.service;

import com.ecotienda.domain.masVendidos;
import com.ecotienda.repository.masVendidosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class masVendidosService {
    
    @Autowired
    private masVendidosRepository masVendidosRepository;
    
    @Transactional(readOnly=true)
    public List<masVendidos> getMasVendidos(){
        var lista= masVendidosRepository.findAll();
        
        return lista;
    }
    
    
    
    
    @Transactional
    public void delete(masVendidos masVendidos){
        masVendidosRepository.delete(masVendidos);
    }
    @Transactional
    public void save(masVendidos masVendidos){
        masVendidosRepository.save(masVendidos);
    }
}