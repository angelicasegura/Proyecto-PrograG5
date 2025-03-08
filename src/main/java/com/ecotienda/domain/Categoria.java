/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecotienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 *
 * @author HP
 */
//@Data
@Entity
@Table(name="categoria")
public class Categoria implements Serializable{
    private static final long serialVersionUI=1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Long id_Categoria;
    private String descripcion;
    private String ruta_Imagen;
    
    @OneToMany
    @JoinColumn(name="id_categoria")
    private List<Producto> productos;

    public Long getId_Categoria() {
        return id_Categoria;
    }

    public void setId_Categoria(Long id_Categoria) {
        this.id_Categoria = id_Categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRuta_Imagen() {
        return ruta_Imagen;
    }

    public void setRuta_Imagen(String ruta_Imagen) {
        this.ruta_Imagen = ruta_Imagen;
    }

   

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    

    
    
    
}
