package com.f1.formula.one.series.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.f1.formula.one.series.domain.Driver;

public interface DriverService {

	Driver findByIdDriver(String driverId);
	
	ResponseEntity<List<Driver>> findAll();
}