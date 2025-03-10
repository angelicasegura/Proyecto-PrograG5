package com.ecotienda.service;

import com.ecotienda.domain.masVendidos;
import com.ecotienda.repository.ProductoRepository;
import com.ecotienda.repository.masVendidosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class masVendidosService {

    @Autowired
    private masVendidosRepository masVendidosRepository;
    @Autowired
    private ProductoRepository productoRepository;

    @Transactional(readOnly = true)
    public List<masVendidos> getMasVendidos() {
        List<masVendidos> lista = masVendidosRepository.findAll();
        System.out.println("Lista de más vendidos: " + lista);
        return lista;
    }
    public masVendidos getmasVendidos(Long id){
        return masVendidosRepository.findById(id).orElse(null);
         
    }

    @Transactional
    public void delete(masVendidos masVendidos) {
        masVendidosRepository.delete(masVendidos);
    }

    @Transactional
    public void save(masVendidos masVendidos) {
        masVendidosRepository.save(masVendidos);
    }
}
