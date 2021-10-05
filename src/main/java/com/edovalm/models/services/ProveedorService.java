package com.edovalm.models.services;

import java.util.List;
import java.util.Optional;

import com.edovalm.models.entity.Proveedor;

public interface ProveedorService {
	public List<Proveedor>findAll();
	public Optional<Proveedor>findById(Integer id);
	public Proveedor save(Proveedor proveedor);
	public void deleteById(Integer id);
}
