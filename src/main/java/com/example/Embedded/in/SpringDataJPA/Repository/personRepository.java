package com.example.Embedded.in.SpringDataJPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Embedded.in.SpringDataJPA.Entity.Person;

@Repository
public interface personRepository extends JpaRepository<Person, Long>{

}
