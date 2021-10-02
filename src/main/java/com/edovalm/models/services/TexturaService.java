package com.edovalm.models.services;

import java.util.List;
import java.util.Optional;

import com.edovalm.models.entity.Textura;

public interface TexturaService {
	public List<Textura>findAll();
	public Optional<Textura>findById(Integer id);
	public Textura save(Textura textura);
	public void deleteById(Integer id);
}
