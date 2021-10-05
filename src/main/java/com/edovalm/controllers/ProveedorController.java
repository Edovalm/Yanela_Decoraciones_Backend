package com.edovalm.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edovalm.models.entity.Proveedor;
import com.edovalm.models.services.ProveedorService;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorController {
	@Autowired
	private ProveedorService proveedorService;
	
	@GetMapping("/{id}")
	public Optional<Proveedor> buscarPorId(@PathVariable Integer id){
		return proveedorService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Proveedor> listar(){
		return proveedorService.findAll();
	}
	
	@PostMapping
	public Proveedor guardar(@RequestBody Proveedor proveedor) {
		return proveedorService.save(proveedor);
	}
	
	@PutMapping("/actualizar/{id}")
	public Proveedor actualizar(@RequestBody Proveedor proveedor , @PathVariable Integer id) {
		Proveedor proEnBD = proveedorService.findById(id).get();
		proEnBD.setNombreProveedor(proveedor.getNombreProveedor()); 
		proEnBD.setImgProveedor(proveedor.getImgProveedor()); 
		proveedorService.save(proEnBD);
		return proveedor;
	}
}
