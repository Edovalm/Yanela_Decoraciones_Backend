package com.edovalm.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proveedores")
public class Proveedor {
	@Id 
	@Column(name = "id_proveedor")
	private Integer idProveedor;
	
	@Column(name = "nombre_proveedor")
	private String nombreProveedor;
	
	@Column(name = "img_proveedor")
	private String imgProveedor;

	public Integer getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Integer idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getNombreProveedor() {
		return nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}

	public String getImgProveedor() {
		return imgProveedor;
	}

	public void setImgProveedor(String imgProveedor) {
		this.imgProveedor = imgProveedor;
	}

	@Override
	public String toString() {
		return "Proveedor [idProveedor=" + idProveedor + ", nombreProveedor=" + nombreProveedor + ", imgProveedor="
				+ imgProveedor + "]";
	}
	
}
