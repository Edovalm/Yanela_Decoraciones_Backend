package com.edovalm.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edovalm.models.entity.Producto;
import com.edovalm.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{
	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public List<Producto> findAll() {
		return productoRepository.findAll();
	}

	@Override
	public Optional<Producto> findById(Integer id) {
		return productoRepository.findById(id);
	}

	@Override
	public Producto save(Producto producto) {
		return productoRepository.save(producto);
	}

	@Override
	public void deleteById(Integer id) {
		productoRepository.deleteById(id);
	}
}
