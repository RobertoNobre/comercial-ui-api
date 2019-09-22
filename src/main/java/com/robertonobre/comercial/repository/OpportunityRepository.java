package com.robertonobre.comercial.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robertonobre.comercial.model.Opportunity;

public interface OpportunityRepository extends JpaRepository<Opportunity, Long>{

	Optional<Opportunity> findByDescriptionAndProspectName(String descricao, String prospectName);
}
