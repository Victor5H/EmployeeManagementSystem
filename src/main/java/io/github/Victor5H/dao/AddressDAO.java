package io.github.Victor5H.dao;

import java.util.List;

import io.github.Victor5H.entities.Address;

public interface AddressDAO {

	boolean insertAdd(Address a);

	boolean deleteAdd(Long id);

	Address getAdd(Long id);

	List<Address> getAllAdd();

	void updateAdd(Address a);
}
