package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Jobs;

@Repository
public interface JobsRepository extends CrudRepository<Jobs, String> {
	
	//EntityManagerFactory factory = javax.persistence.Persistence.createEntityManagerFactory("Jobs");
    /*@PersistenceContext
	EntityManager em ;
*/
	
	
	
}
