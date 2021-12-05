package com.bocobi.back.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bocobi.back.models.Patient;


public interface PatientRepos extends JpaRepository<Patient, Integer> {

}
