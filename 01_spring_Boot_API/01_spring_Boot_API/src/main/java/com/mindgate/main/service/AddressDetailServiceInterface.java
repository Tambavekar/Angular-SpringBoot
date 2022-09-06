package com.mindgate.main.service;

import java.util.List;

import com.mindgate.main.Domain.Address;

public interface AddressDetailServiceInterface {
	public boolean addNewAddress(Address address);
	public List<Address> getAllAddresses();
	  public boolean deleteAddressByAddressId(int addressId);
	  public Address getAddressByAddressId(int addressId);
	  public boolean updateByAddressId(Address address);

}
