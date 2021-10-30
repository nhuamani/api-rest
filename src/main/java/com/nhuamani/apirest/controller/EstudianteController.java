package com.nhuamani.apirest.controller;

// import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nhuamani.apirest.model.Estudiante;
import com.nhuamani.apirest.service.EstudianteService;

@RestController
public class EstudianteController {
	
	@Autowired
	private EstudianteService estudianteService;
	
	@GetMapping("api/estudiantes")
	public List<Estudiante> getAllEstudiantes() {
		return estudianteService.getAll();
	}
	
	@PostMapping("api/estudiantes")
	public Estudiante saveEstudiante(@RequestBody Estudiante estudiante ) {
		System.out.println(estudiante);
		estudianteService.save(estudiante);
		return estudiante;
	}
	
	@GetMapping("api/estudiantes/{id}")
	public Estudiante getByIdEstudiante(@PathVariable("id") int id) {
		return estudianteService.getById(id);
	}
	
	@PutMapping("api/estudiantes")
	public void updateEstudiante(@RequestBody Estudiante estudiante) {
		estudianteService.update(estudiante);
	}
	
	@DeleteMapping("api/estudiantes/{id}")
	public void deleteEstudiante(@PathVariable("id") int id) {
		estudianteService.delete(id);
	}
	
	
	/*
	@GetMapping("api/estudiante")
	public List<Estudiante> listarEstudiantes() {
		List<Estudiante> listarEstuadiantes = new ArrayList<>();
		
		Estudiante e = new Estudiante();
		e.setId(1);
		e.setFirst_name("Lucas");
		e.setLast_name("Kraif");
		e.setEmail("lucas@gmail.com");
		e.setNota(17.0);
		
		Estudiante e1 = new Estudiante();
		e1.setId(2);
		e1.setFirst_name("Luana");
		e.setLast_name("Mestas");
		e.setEmail("luana@gmail.com");
		e.setNota(20.0);
		
		listarEstuadiantes.add(e);
		listarEstuadiantes.add(e1);
		
		return listarEstuadiantes;

	}
*/

}
