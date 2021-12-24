package com.bocobi.back.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bocobi.back.models.Alerte;

public interface MedicamentRepos extends JpaRepository<Alerte, Integer>{

}
