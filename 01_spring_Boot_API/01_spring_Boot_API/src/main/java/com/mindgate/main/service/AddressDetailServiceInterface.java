package com.mindgate.main.service;

import java.util.List;

import com.mindgate.main.Domain.Address;

public interface AddressDetailServiceInterface {
	public boolean addNewAddress(Address address);
	public List<Address> getAllAddresses();}
