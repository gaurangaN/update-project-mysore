package com.person.api.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.person.api.model.Person;

public interface PersonRepository extends JpaRepository<Person,Integer> {

	public Person findByPersonId(Integer personId);
	
	public List<Person> findByCreateddateBetween(LocalDate start, LocalDate end);
}
