package com.edovalm.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edovalm.models.entity.Usuario;
import com.edovalm.models.services.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin("*")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/{id}")
	public Optional<Usuario> buscarPorId(@PathVariable Integer id){
		return usuarioService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Usuario> listar(){
		return usuarioService.findAll();
	}
	
	@PostMapping
	public Usuario guardar(@RequestBody Usuario usuario) {
		return usuarioService.save(usuario);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		usuarioService.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public Usuario actualizar(@RequestBody Usuario usuario , @PathVariable Integer id) {
		Usuario usuEnBD = usuarioService.findById(id).get();
		usuEnBD.setNombreUsuario(usuario.getNombreUsuario()); 
		usuEnBD.setImgUsuario(usuario.getImgUsuario()); 
		usuEnBD.setContraseñaUsuario(usuario.getContraseñaUsuario());
		usuEnBD.setEmailUsuario(usuario.getEmailUsuario());
		usuarioService.save(usuEnBD);
		return usuario;
	}
}
