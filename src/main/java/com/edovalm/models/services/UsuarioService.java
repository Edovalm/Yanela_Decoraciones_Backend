package com.edovalm.models.services;

import java.util.List;
import java.util.Optional;

import com.edovalm.models.entity.Usuario;

public interface UsuarioService {
	public List<Usuario>findAll();
	public Optional<Usuario>findById(Integer id);
	public Usuario save(Usuario usuario);
	public void deleteById(Integer id);
}
