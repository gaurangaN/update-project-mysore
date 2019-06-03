package com.person.api.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import com.person.api.model.AddressPerson;
import com.person.api.model.Person;
import com.person.api.repository.AddressRepository;
import com.person.api.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	PersonRepository personRepository;

	@PostConstruct
	private void saveDumyrecords() {
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Praveen", LocalDate.of(2017, 11, 10)));
		personList.add(new Person("Praveen", LocalDate.of(2017, 11, 10)));
		personList.add(new Person("Praveen", LocalDate.of(2017, 11, 10)));
		personList.add(new Person("Praveen", LocalDate.of(2017, 11, 10)));
		personList.add(new Person("Praveen", LocalDate.of(2017, 11, 10)));
		personRepository.saveAll(personList);

	}

	public Person getPersonById(int id) {
		return personRepository.findByPersonId(id);
	}

	public List<Person> findAllPerson() {
		return personRepository.findAll();
	}

	public List<Person> findAllPerson(LocalDate start, LocalDate end) {

		return personRepository.findByCreateddateBetween(start, end);
	}

	public void deletePersonById(int personId) {
		personRepository.deleteById(personId);
	}

	public Person updatePerson(Person person) {
		return personRepository.save(person);
		
		
	}

}
