
package com.ecotienda.controller;

import com.ecotienda.domain.Categoria;
import com.ecotienda.service.CategoriaService;

import com.ecotienda.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private ProductoService productoService;
    @Autowired
    private CategoriaService categoriaService;
    @GetMapping("/categoria")
    public String listado(Model model) {
        
        var lista=categoriaService.getCategorias(true);
        model.addAttribute("categorias",lista);
        var producto=productoService.getProductos(false);
        model.addAttribute("productos", producto);
        
        return "/categorias/categoria";
    }
    @GetMapping("/categoria/{id_Categoria}")
    public String listado2(Model model, Categoria categoria) {
        
        var lista=categoriaService.getCategorias(true);
        model.addAttribute("categorias",lista);
        categoria=categoriaService.getCategoria(categoria);
        
        model.addAttribute("productos", categoria.getProductos());
        
        return "/categorias/categoria";
    }
}
