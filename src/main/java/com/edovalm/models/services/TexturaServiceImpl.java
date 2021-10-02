package com.edovalm.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edovalm.models.entity.Textura;
import com.edovalm.repository.TexturaRepository;

@Service
public class TexturaServiceImpl implements TexturaService{
	@Autowired
	private TexturaRepository texturaRepository;

	@Override
	public List<Textura> findAll() {
		return texturaRepository.findAll();
	}

	@Override
	public Optional<Textura> findById(Integer id) {
		return texturaRepository.findById(id);
	}

	@Override
	public Textura save(Textura textura) {
		return texturaRepository.save(textura);
	}

	@Override
	public void deleteById(Integer id) {
		texturaRepository.deleteById(id);
	}
}
