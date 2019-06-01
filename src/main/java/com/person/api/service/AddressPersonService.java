package com.person.api.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.person.api.model.AddressPerson;
import com.person.api.repository.AddressRepository;

@Service
public class AddressPersonService {

	@Autowired
	private AddressRepository addressRepository;

	@PostConstruct
	private void saveDumyrecords() {
		List<AddressPerson> adressList = new ArrayList<AddressPerson>();
		adressList.add(new AddressPerson("lnt tech service manyta bangaloru", "manyta", LocalDate.of(2017, 11, 10),1));
		adressList.add(new AddressPerson("IBM tech service manyta bamngaloru", "manyta", LocalDate.of(2017, 11, 10),1));
		adressList.add(new AddressPerson("Lowes Tech bangaloru karnataka", "manyta", LocalDate.of(2017, 11, 10),1));
		adressList.add(new AddressPerson("Cerner tech bangaloru", "manyta", LocalDate.of(2017, 11, 10),1));
		adressList.add(new AddressPerson("lnt tech service manyta bangaloru", "manyta", LocalDate.of(2017, 11, 10),2));
		adressList.add(new AddressPerson("IBM tech service manyta bamngaloru", "manyta", LocalDate.of(2017, 11, 10),2));
		adressList.add(new AddressPerson("Lowes Tech bangaloru karnataka", "manyta", LocalDate.of(2017, 11, 10),3));
		adressList.add(new AddressPerson("Cerner tech bangaloru", "manyta", LocalDate.of(2017, 11, 10),1));
		adressList.add(new AddressPerson("", "", LocalDate.of(2017, 11, 10),2));
		addressRepository.saveAll(adressList);

	}

	public List<AddressPerson> getAllAddress() {
		return addressRepository.findAll();
	}
}
