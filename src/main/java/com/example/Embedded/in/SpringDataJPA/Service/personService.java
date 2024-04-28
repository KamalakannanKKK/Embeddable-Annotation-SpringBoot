package com.example.Embedded.in.SpringDataJPA.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Embedded.in.SpringDataJPA.Entity.Person;
import com.example.Embedded.in.SpringDataJPA.Repository.personRepository;

@Service
public class personService {

	
	@Autowired
	private personRepository personrepo;
	
	public Person getPerson(long id) {
		return this.personrepo.findById(id).get();
	}
	
	public Person addPerson(Person person) {
		return this.personrepo.save(person);
	}
}
