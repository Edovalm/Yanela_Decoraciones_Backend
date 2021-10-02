package com.edovalm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edovalm.models.entity.Textura;

@Repository
public interface TexturaRepository extends JpaRepository<Textura, Integer> {

}
