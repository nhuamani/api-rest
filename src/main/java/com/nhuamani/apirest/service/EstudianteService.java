package com.nhuamani.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhuamani.apirest.model.Estudiante;
import com.nhuamani.apirest.repository.EstudianteRepository;

@Service
public class EstudianteService {
	
	@Autowired
	private EstudianteRepository estudianteRepository;
	
	public List<Estudiante> getAll() {
		return estudianteRepository.findAll();
	}
	
	public Estudiante getById(Integer id) {
		return estudianteRepository.findById(id).get();
	}
	
	public void save(Estudiante estudiante) {
		estudianteRepository.save(estudiante);
	}
	
	public void update(Estudiante estudiante) {
		estudianteRepository.save(estudiante);
	}
	
	public void delete(Integer id) {
		 estudianteRepository.deleteById(id);
	}
	
}
