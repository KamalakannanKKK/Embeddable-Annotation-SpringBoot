package com.example.Embedded.in.SpringDataJPA.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Embedded.in.SpringDataJPA.Entity.Person;
import com.example.Embedded.in.SpringDataJPA.Service.personService;

@RestController
public class Controller {

	@Autowired
	private personService personservice;
	
	@GetMapping("/get/{id}")
	public Person getById(@PathVariable long id) {
		return this.personservice.getPerson(id);
	}
	
	@PostMapping("/save")
	public Person savePerson(@RequestBody Person person) {
		return this.personservice.addPerson(person);
	}
	
}
