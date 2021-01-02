package com.example.k8s.springbootmongo.springbootk8smongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="satellite")
public class Satellite {
	 @Id  
    private Long id;
    private String satelliteId;
    private String description;
    private String name;
    private String orbit;
    private String health;
    private String constellation;
    

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getsatelliteId() {
		return satelliteId;
	}
	public void setProductId(String satelliteId) {
		this.satelliteId = satelliteId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setPrice(String name) {
		this.name = name;
	}
	public String getOrbit() {
		return orbit;
	}
	public void setOrbit(String orbit) {
		this.orbit = orbit;
	}
	public String getHealth() {
		return health;
	}
	public void setHealth(String health) {
		this.health = health;
	}
	public String getConstellation() {
		return constellation;
	}
	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}
    
    
}