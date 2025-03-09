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
@RequestMapping("/catalogo")
public class CatalogoController {
    
    @Autowired
    private CategoriaService categoriaService;
    @Autowired
    private ProductoService productoService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var lista = categoriaService.getCategorias(false);
        model.addAttribute("categorias", lista);
        var productos=productoService.getProductos(false);
        model.addAttribute("productos", productos);
        model.addAttribute("mostrarCatalogo", true);
        return "/catalogo/listado";
    }
    
    @GetMapping("/listado/{idCategoria}")
    public String listado(Model model,Categoria categoria) {
        var lista = categoriaService.getCategorias(false);
        model.addAttribute("categorias", lista);
        
        categoria=categoriaService.getCategoria(categoria);
        
        model.addAttribute("productos", categoria.getProductos());
        return "/catalogo/listado";
    }
}