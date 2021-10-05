package com.edovalm.models.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {
	@Id
	@Column(name = "id_producto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProducto;
	
	@Column(name = "nombre_producto")
	private String nombreProducto;

    @Column(name = "precio_producto")
    private BigDecimal precioProducto;

	@Column(name = "img_producto")
	private String imgProducto;

    @Column(name = "descripcion_producto")
	private String descripcionProducto;

    @ManyToOne
    @JoinColumn(name = "categoria_producto")
	Categoria categoriaProducto;

    @ManyToOne
    @JoinColumn(name = "proveedor_producto")
	Proveedor proveedorProducto;
    
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
    		name = "productos_texturas",
    		joinColumns = @JoinColumn(name = "producto_text"),
    		inverseJoinColumns = @JoinColumn(name = "textura_prod"))
    private List<Textura> texturas = new ArrayList<Textura>();

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public BigDecimal getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(BigDecimal precioProducto) {
		this.precioProducto = precioProducto;
	}

	public String getImgProducto() {
		return imgProducto;
	}

	public void setImgProducto(String imgProducto) {
		this.imgProducto = imgProducto;
	}

	public String getDescripcionProducto() {
		return descripcionProducto;
	}

	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}

	public Categoria getCategoriaProducto() {
		return categoriaProducto;
	}

	public void setCategoriaProducto(Categoria categoriaProducto) {
		this.categoriaProducto = categoriaProducto;
	}

	public Proveedor getProveedorProducto() {
		return proveedorProducto;
	}

	public void setProveedorProducto(Proveedor proveedorProducto) {
		this.proveedorProducto = proveedorProducto;
	}

	public List<Textura> getTexturas() {
		return texturas;
	}

	public void setTexturas(List<Textura> texturas) {
		this.texturas = texturas;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precioProducto="
				+ precioProducto + ", imgProducto=" + imgProducto + ", descripcionProducto=" + descripcionProducto
				+ ", categoriaProducto=" + categoriaProducto + ", proveedorProducto=" + proveedorProducto
				+ ", texturas=" + texturas + "]";
	}
}
