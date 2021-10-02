package com.edovalm.models.services;

import java.util.List;
import java.util.Optional;

import com.edovalm.models.entity.Categoria;

public interface CategoriaService {
	public List<Categoria>findAll();
	public Optional<Categoria>findById(Integer id);
	public Categoria save(Categoria categoria);
	public void deleteById(Integer id);
}
