/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecotienda.controller;

import com.ecotienda.domain.Producto;
import com.ecotienda.service.CategoriaService;
import com.ecotienda.service.ProductoService;
import com.ecotienda.service.FirebaseStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

//@Controller
//@RequestMapping("/categorias")
//public class ProductoController {
//
//    @Autowired
//    private ProductoService productoService;
//    @Autowired
//    private CategoriaService categoriaService;
//    @GetMapping("/categoria")
//    public String listado(Model model) {
//        var lista = productoService.getProductos(false);
//        model.addAttribute("productos", lista);
//        var categorias=categoriaService.getCategorias(true);
//        model.addAttribute("categorias",categorias);
//        
//        return "/categorias/categoria";
//    }
// 
//}
