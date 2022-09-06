package com.mindgate.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.Domain.Address;
import com.mindgate.main.service.AddressDetailServiceInterface;
import com.mindgate.main.service.AddressService;

@CrossOrigin("*")
@RestController
@RequestMapping("addressapi")
public class AdderessController {

	@Autowired
	private AddressDetailServiceInterface addressDetailServiceInterface;

	// http://localhost:8080/addressapi/address
	@RequestMapping(value = "address", method = RequestMethod.POST)
	public boolean addNewAddress(@RequestBody Address address) {
		return addressDetailServiceInterface.addNewAddress(address);
	}

	// http://localhost:8080/addressapi/address/all
	@RequestMapping(value = "address/all", method = RequestMethod.GET)
	public List<Address> getAllAddresses() {
		return addressDetailServiceInterface.getAllAddresses();
	}


@RequestMapping(value = "address/{addressId}", method = RequestMethod.DELETE)
	public boolean deleteAddress(@PathVariable int addressId) {
		return addressDetailServiceInterface.deleteAddressByAddressId(addressId);
	}

	@RequestMapping(value = "address/{addressId}", method = RequestMethod.GET)
	public Address getSingleAddress(@PathVariable int addressId) {
		return addressDetailServiceInterface.getAddressByAddressId(addressId);
	}
	@RequestMapping(value = "address", method = RequestMethod.PUT)
	public boolean updateAddress(@RequestBody Address address) {
		return addressDetailServiceInterface.updateByAddressId(address);
	}

}
