/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecotienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author HP
 */
//@Data
@Entity
@Table(name = "mas_Vendidos")
public class masVendidos implements Serializable {

    private static final long serialVersionUI = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mas_Vendidos")
    private Long idMasVendidos;
    private String rutaImagen;
    private Long idProducto;
    

    

    public Long getIdMasVendidos() {
        return idMasVendidos;
    }

    public void setIdMasVendidos(Long idMasVendidos) {
        this.idMasVendidos = idMasVendidos;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }
}
