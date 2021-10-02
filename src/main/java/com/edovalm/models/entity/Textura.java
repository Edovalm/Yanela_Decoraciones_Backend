package com.edovalm.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "texturas")
public class Textura {
	@Id
	@Column(name = "id_textura")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTextura;
	
	@Column(name = "nombre_textura")
	private String nombreTextura;
	
	@Column(name = "img_textura")
	private String imgTextura;

	public Integer getIdTextura() {
		return idTextura;
	}

	public void setIdTextura(Integer idTextura) {
		this.idTextura = idTextura;
	}

	public String getNombreTextura() {
		return nombreTextura;
	}

	public void setNombreTextura(String nombreTextura) {
		this.nombreTextura = nombreTextura;
	}

	public String getImgTextura() {
		return imgTextura;
	}

	public void setImgTextura(String imgTextura) {
		this.imgTextura = imgTextura;
	}

	@Override
	public String toString() {
		return "Textura [idTextura=" + idTextura + ", nombreTextura=" + nombreTextura + ", imgTextura=" + imgTextura
				+ "]";
	}
}
