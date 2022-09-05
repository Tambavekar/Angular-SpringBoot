package com.mindgate.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.mindgate.main.Domain.Address;
import com.mindgate.main.repository.AddressDetailsRepositoryInterface;

@Service
public class AddressService implements AddressDetailServiceInterface {

	@Autowired
	private AddressDetailsRepositoryInterface addressDetailsRepository;
	@Override
	public boolean addNewAddress(@RequestBody Address address) {
		// TODO Auto-generated method stub
		System.out.println(address);
		return addressDetailsRepository.addNewAddress(address);
	}

	@Override
	public List<Address> getAllAddresses() {
		// TODO Auto-generated method stub
		return addressDetailsRepository.getAllAddresses();
	}

}
