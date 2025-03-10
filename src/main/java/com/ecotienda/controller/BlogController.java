/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecotienda.controller;

import com.ecotienda.domain.Producto;
import com.ecotienda.domain.masVendidos;

import com.ecotienda.service.ProductoService;
import com.ecotienda.service.masVendidosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blog")
public class BlogController {

    
   
    
    @GetMapping("/listado")
    public String listado() {
       
        
        
        
        return "/blog/listado";
    }
    
    

}
