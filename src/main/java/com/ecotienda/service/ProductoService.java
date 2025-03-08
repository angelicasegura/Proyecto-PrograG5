
package com.ecotienda.service;

import com.ecotienda.domain.Producto;
import com.ecotienda.repository.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoService {
    
    @Autowired
    private ProductoRepository productoRepository;
    
    @Transactional(readOnly=true)
    public List<Producto> getProductos(boolean activos){
        var lista= productoRepository.findAll();
        
        return lista;
    }
    @Transactional(readOnly=true)
    
    public Producto getProducto(Producto producto){
        producto= productoRepository.findById(producto.getCategoria().getId_Categoria()).orElse(null);
        return producto;
    }
    
    @Transactional
    public void delete(Producto producto){
        productoRepository.delete(producto);
    }
    @Transactional
    public void save(Producto producto){
        productoRepository.save(producto);
    }
}