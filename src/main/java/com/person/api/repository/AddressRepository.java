package com.person.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.person.api.model.AddressPerson;

public interface AddressRepository extends JpaRepository<AddressPerson,Integer>{

}
