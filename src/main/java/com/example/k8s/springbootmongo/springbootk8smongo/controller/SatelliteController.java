package com.example.k8s.springbootmongo.springbootk8smongo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.k8s.springbootmongo.springbootk8smongo.entity.Satellite;
import com.example.k8s.springbootmongo.springbootk8smongo.repository.SatelliteRepository;

@RestController
public class SatelliteController {
	
	@Autowired
	private SatelliteRepository satelliteRepository;
	
	@PostMapping("/addSatellite")
	public String saveProduct(@RequestBody Satellite satellite) {
		satelliteRepository.save(satellite);
		return "Satellite added successfully::"+satellite.getId();
		
	}
	
	@GetMapping("/findAllSatellites")
	public List<Satellite> getSatellites() {
		return satelliteRepository.findAll();
	}

	@GetMapping("/findSatellite/{id}")
	public Optional<Satellite> getSatellite(@PathVariable Long id) {
		return satelliteRepository.findById(id);
	}
	
	@GetMapping("/deleteSatellite/{id}")
	public String deleteSatellite(@PathVariable Long id) {
		satelliteRepository.deleteById(id);
		return "Deleted Satellite Successfully::"+id;
	}
	
	@GetMapping("/")
	public String root() {
		return "Hello from root";
	}
	
	@GetMapping("/demo")
	public String demo() {
		return "Demo Page";
	}



}
