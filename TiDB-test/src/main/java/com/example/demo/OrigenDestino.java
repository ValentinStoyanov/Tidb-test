package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class OrigenDestino {

	public OrigenDestino() {
		super();
	}
	
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private Integer id;
	  private String idPropietario;
	  private String direccion;
	  private String ciudad;
	  private String provincia;
	  private String idCoordenadas;
	  
	  
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIdPropietario() {
		return idPropietario;
	}
	public void setIdPropietario(String idPropietario) {
		this.idPropietario = idPropietario;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getIdCoordenadas() {
		return idCoordenadas;
	}
	public void setIdCoordenadas(String idCoordenadas) {
		this.idCoordenadas = idCoordenadas;
	}
	  
	  
	
}
