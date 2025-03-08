/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecotienda.controller;

import com.ecotienda.domain.Producto;

import com.ecotienda.service.ProductoService;
import com.ecotienda.service.masVendidosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("index")
public class masVendidosController {

    @Autowired
    private ProductoService productoService;
    @Autowired
    private masVendidosService masVendidosService;

    @GetMapping("index")
    public String listado(Model model) {
        var lista = masVendidosService.getMasVendidos(false);
        model.addAttribute("masVendidos", lista);


        return "index";
    }
    
//    @GetMapping("/listado/{idproducto}")
//    public String listado(Model model,Producto producto) {
//        var lista = productoService.getProductos(false);
//        model.addAttribute("producto", lista);
//        producto=productoService.getproducto(producto);
//        
//        model.addAttribute("masVendidos", producto.getProductos());
//
//        return "/masVendidos/listado";
//    }

}
