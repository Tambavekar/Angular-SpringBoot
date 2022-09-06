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
	private static final String UPDATE_ADDRESS = "UPDATE address_details SET building_name = ? , street = ? , city = ? , pin = ? WHERE address_id = ?";
	private static final String DELETE_ADDRESS = "DELETE address_details WHERE address_id = ?";
	private static final String SELECT_SINGLE_ADDRESS = "SELECT * FROM address_details WHERE address_id = ?";
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
	@Override
	public boolean deleteAddressByAddressId(int addressId) {
		// TODO Auto-generated method stub
		int result = jdbcTemplate.update(DELETE_ADDRESS, addressId);
		if (result >0)
			return true;
		return false;
	}
	@Override
	public Address getAddressByAddressId(int addressId) {
		// TODO Auto-generated method stub
		Address address=jdbcTemplate.queryForObject(SELECT_SINGLE_ADDRESS,new AddressRowMapper(), addressId);
		
		return address;
	}
	@Override
	public boolean updateByAddressId(Address address) {
		// TODO Auto-generated method stub
		Object [] param = { address.getBuildingName(),
				             address.getStreet(),
				             address.getCity(),
				             address.getPin(),
				             address.getAddressId()
		};
		int result = jdbcTemplate.update(UPDATE_ADDRESS, param);
		if (result >0)
			return true;
		return false;
	}

}
