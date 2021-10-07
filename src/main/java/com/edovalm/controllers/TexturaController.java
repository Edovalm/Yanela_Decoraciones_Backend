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

import com.edovalm.models.entity.Textura;
import com.edovalm.models.services.TexturaService;

@RestController
@RequestMapping("/api/texturas")
public class TexturaController {
	@Autowired
	private TexturaService texturaService;
	
	@GetMapping("/{id}")
	public Optional<Textura> buscarPorId(@PathVariable Integer id){
		return texturaService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Textura> listar(){
		return texturaService.findAll();
	}
	
	@PostMapping
	public Textura guardar(@RequestBody Textura textura) {
		return texturaService.save(textura);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		texturaService.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public Textura actualizar(@RequestBody Textura textura , @PathVariable Integer id) {
		Textura texEnBD = texturaService.findById(id).get();
		texEnBD.setNombreTextura(textura.getNombreTextura()); 
		texEnBD.setImgTextura(textura.getImgTextura()); 
		//texEnBD.setProductos(textura.getProductos()); //En caso de bidireccionalidad
		texturaService.save(texEnBD);
		return textura;
	}
}
