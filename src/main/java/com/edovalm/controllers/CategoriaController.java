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

import com.edovalm.models.entity.Categoria;
import com.edovalm.models.services.CategoriaService;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("/{id}")
	public Optional<Categoria> buscarPorId(@PathVariable Integer id){
		return categoriaService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Categoria> listar(){
		return categoriaService.findAll();
	}
	
	@PostMapping
	public Categoria guardar(@RequestBody Categoria categoria) {
		return categoriaService.save(categoria);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		categoriaService.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public Categoria actualizar(@RequestBody Categoria categoria , @PathVariable Integer id) {
		Categoria catEnBD = categoriaService.findById(id).get();
		catEnBD.setNombreCategoria(categoria.getNombreCategoria()); 
		catEnBD.setImgCategoria(categoria.getImgCategoria()); 
		catEnBD.setDescripcionCategoria(categoria.getDescripcionCategoria()); 
		categoriaService.save(catEnBD);
		return categoria;
	}
}
