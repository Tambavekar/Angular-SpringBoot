package com.mindgate.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.mindgate.main.Domain.Address;

@Repository
public class AddressDetailsRepository implements AddressDetailsRepositoryInterface {

	
	private static final String INSERT_NEW_ADDRESS = "insert into address_details values(address_details_sequence.NEXTVAL,?,?,?,?)";
	private static final String SELECT_ALL_ADDRESS = "select * from address_details";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public boolean addNewAddress(Address address) {
		// TODO Auto-generated method stub
		Object[] param= {address.getBuildingName(),address.getStreet(),address.getCity(),address.getPin()};
		int result=jdbcTemplate.update(INSERT_NEW_ADDRESS,param);
		if(result>0)
		return true;
		return false;
	}
	@Override
	public List<Address> getAllAddresses() {
		List<Address> allAddresses= jdbcTemplate.query(SELECT_ALL_ADDRESS, new AddressRowMapper());
		return allAddresses;
	}

}
