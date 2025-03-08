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

@Controller
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;
    @Autowired
    private CategoriaService categoriaService;
    @GetMapping("/listado")
    public String listado(Model model) {
        var lista = productoService.getProductos(false);
        model.addAttribute("productos", lista);
        var categorias=categoriaService.getCategorias(true);
        model.addAttribute("categorias",categorias);
        return "/producto/listado";
    }

    @GetMapping("/eliminar/{idProducto}")
    public String eliminar(Producto producto) {
        productoService.delete(producto);

        return "redirect:/producto/listado";
    }

    @GetMapping("/modificar/{idProducto}")
    public String modificar(Producto producto, Model model) {
        producto = productoService.getProducto(producto);
        model.addAttribute("producto", producto);
        var categorias=categoriaService.getCategorias(true);
        model.addAttribute("categorias",categorias);
        return "/producto/modifica";
    }
    @Autowired
    private FirebaseStorageService firebaseStorageService;
    @PostMapping("/guardar")
    public String guardar(Producto producto, 
            @RequestParam("imagenFile") MultipartFile imagenFile){
        if(!imagenFile.isEmpty()){
            productoService.save(producto);
            String ruta= firebaseStorageService.cargaImagen(imagenFile,"producto",producto.getId_producto());
            producto.setRuta_imagen(ruta);
        }
        
        productoService.save(producto);
        return "redirect:/producto/listado";
    }
}
