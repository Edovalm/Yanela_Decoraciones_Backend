package com.edovalm.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edovalm.models.entity.Proveedor;
import com.edovalm.repository.ProveedorRepository;

@Service
public class ProveedorServiceImpl implements ProveedorService{
	@Autowired
	private ProveedorRepository proveedorRepository;

	@Override
	public List<Proveedor> findAll() {
		return proveedorRepository.findAll();
	}

	@Override
	public Optional<Proveedor> findById(Integer id) {
		return proveedorRepository.findById(id);
	}

	@Override
	public Proveedor save(Proveedor proveedor) {
		return proveedorRepository.save(proveedor);
	}

	@Override
	public void deleteById(Integer id) {
		proveedorRepository.deleteById(id);
	}
}
