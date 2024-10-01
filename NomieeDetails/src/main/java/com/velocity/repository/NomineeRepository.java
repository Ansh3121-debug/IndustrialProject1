package com.velocity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Nominee;

@Repository
public interface NomineeRepository extends JpaRepository<Nominee, Integer> {

}
