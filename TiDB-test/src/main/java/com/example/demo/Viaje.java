package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Viaje {

	public Viaje() {
		super();
	}
	
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private Integer id;
	  private String idConductor;
	  private String idCamion;
	  private String idRemolque;
	  
	  
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIdConductor() {
		return idConductor;
	}
	public void setIdConductor(String idConductor) {
		this.idConductor = idConductor;
	}
	public String getIdCamion() {
		return idCamion;
	}
	public void setIdCamion(String idCamion) {
		this.idCamion = idCamion;
	}
	public String getIdRemolque() {
		return idRemolque;
	}
	public void setIdRemolque(String idRemolque) {
		this.idRemolque = idRemolque;
	}
	  
	  
	
}
