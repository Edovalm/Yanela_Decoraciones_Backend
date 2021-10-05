package com.edovalm.models.services;

import java.util.List;
import java.util.Optional;

import com.edovalm.models.entity.Producto;

public interface ProductoService {
	public List<Producto>findAll();
	public Optional<Producto>findById(Integer id);
	public Producto save(Producto producto);
	public void deleteById(Integer id);
}
