package com.robertonobre.comercial.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robertonobre.comercial.model.Opportunity;
import com.robertonobre.comercial.repository.OpportunityRepository;

@RestController
@RequestMapping("/opportunity")
public class OpportunityController {

	@Autowired
	private OpportunityRepository opportunityRepository;
	
	@GetMapping
	public List<Opportunity> getAll() {
		return opportunityRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Opportunity> getById(@PathVariable Long id) {
		Optional<Opportunity> opportunity = opportunityRepository.findById(id);
		
		if(opportunity.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(opportunity.get());
	}
}
