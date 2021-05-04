package com.cg.ucaa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ucaa.entities.LoginEntity;

/**
 * This is a repository class extending JPA Repository
 * @author Akshat Kumar
 *
 */
@Repository
public interface ILoginRepository extends JpaRepository<LoginEntity, Long>{
	
	
}
