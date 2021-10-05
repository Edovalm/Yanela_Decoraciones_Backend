package com.edovalm.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edovalm.models.entity.Producto;
import com.edovalm.models.services.ProductoService;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/{id}")
	public Optional<Producto> buscarPorId(@PathVariable Integer id){
		return productoService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Producto> listar(){
		return productoService.findAll();
	}
	
	@PostMapping
	public Producto guardar(@RequestBody Producto producto) {
		return productoService.save(producto);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		productoService.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public Producto actualizar(@RequestBody Producto producto , @PathVariable Integer id) {
		Producto proEnBD = productoService.findById(id).get();
		proEnBD.setNombreProducto(producto.getNombreProducto()); 
        proEnBD.setPrecioProducto(producto.getPrecioProducto()); 
		proEnBD.setImgProducto(producto.getImgProducto()); 
		proEnBD.setDescripcionProducto(producto.getDescripcionProducto()); 
        proEnBD.setCategoriaProducto(producto.getCategoriaProducto()); 
		proEnBD.setProveedorProducto(producto.getProveedorProducto());
		proEnBD.setTexturas(producto.getTexturas());
		productoService.save(proEnBD);
		return producto;
	}
}
