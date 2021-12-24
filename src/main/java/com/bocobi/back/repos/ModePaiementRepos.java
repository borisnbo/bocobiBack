package com.bocobi.back.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bocobi.back.models.ModePaiement;

public interface ModePaiementRepos extends JpaRepository<ModePaiement, Integer> {

}
